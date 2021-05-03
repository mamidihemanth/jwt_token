package com.mango.spring.jwt_token.controller;


import com.mango.spring.jwt_token.model.AuthRequest;
import com.mango.spring.jwt_token.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(method = RequestMethod.GET, value = "login")
    public String welcome() {
        return "Spring Boot Application using JWToken for Authentication and Authorization";
    }

    @RequestMapping(method = RequestMethod.POST, value = "authenticate")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
    try {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
    }catch (Exception e) {
        throw new Exception("Invalid User details");
    }
    return jwtUtil.generateToken(authRequest.getUserName());
    }

}
