package com.primeira.api.controller;

import com.primeira.api.model.ResponseToken;
import com.primeira.api.model.User;
import com.primeira.api.repository.UserRepository;
import com.primeira.api.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseToken login(@RequestBody User user) {
        User found = userRepository.findByUsername(user.getUsername())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Usuário não existe"));

        if (found.getPassword().equals(user.getPassword())) {
            String token = jwtTokenProvider.generateToken(user.getUsername());
            return new ResponseToken("Autenticado", token);
        } else {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Senha incorreta, revise!");
        }
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Usuário existente, tente outro");
        }
        return userRepository.save(user);
    }
}