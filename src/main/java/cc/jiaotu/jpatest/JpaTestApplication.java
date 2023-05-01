package cc.jiaotu.jpatest;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JpaTestApplication {

    public static void main(String[] args) {
//        SpringApplication.run(JpaTestApplication.class, args);
        SpringApplication springApplication = new SpringApplication(JpaTestApplication.class);
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.run(args);
    }

}
