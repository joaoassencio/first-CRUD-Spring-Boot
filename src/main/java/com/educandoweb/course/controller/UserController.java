package com.educandoweb.course.controller;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/home")
    public ResponseEntity<User> getUser() {

        User user = new User(
                1L,
                "João",
                "joao@email.com",
                "61 99999-9999",
                "@Dm1n"
        );

        return ResponseEntity.ok().body(user);
    }
}
