package cc.jiaotu.jpatest.controller;

import cc.jiaotu.jpatest.entity.UserEntity;
import cc.jiaotu.jpatest.repositories.UserRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SecurityRequirement(name = "JWT")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("getUser")
    public List<UserEntity> GetUser() {
        List<UserEntity> UserList = userRepository.findAll();
        return UserList;
    }

}
