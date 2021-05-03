package com.mango.spring.jwt_token;

import com.mango.spring.jwt_token.model.User;
import com.mango.spring.jwt_token.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class JwtTokenApplication {
    public static void main(String[] args) {
        SpringApplication.run(JwtTokenApplication.class, args);
    }
}
