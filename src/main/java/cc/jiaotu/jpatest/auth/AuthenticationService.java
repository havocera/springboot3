package cc.jiaotu.jpatest.auth;


import cc.jiaotu.jpatest.config.JwtService;
import cc.jiaotu.jpatest.entity.UserEntity;
import cc.jiaotu.jpatest.repositories.UserRepository;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.Optional;

/**
 * @author ihavoc
 * @since 2023-05-2
 */
@Service
@RequiredArgsConstructor
public class AuthenticationService {
    @Resource
    private final UserRepository repository;
    @Resource
    private final PasswordEncoder passwordEncoder;
    @Resource
    private final JwtService jwtService;
    @Resource
    private final AuthenticationManager authenticationManager;


    public AuthenticationResponse register(RegisterRequest request) {
        var user = UserEntity.builder()
                .username(request.getUsername())
                .truename(request.getTruename())
                .phone(request.getPhone())
                .password(passwordEncoder.encode(request.getPassword()))
                .status(1)
                .build();

        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) throws Exception {
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getUsername(),
                            request.getPassword()
                    )
            );
        }catch (Exception e){
            System.out.println("request = " + e);
            throw new Exception("Incorrect username or password", e);
        }
        var user = repository.findByUsername(request.getUsername())
                .orElseThrow();
        System.out.println("request = " + user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
