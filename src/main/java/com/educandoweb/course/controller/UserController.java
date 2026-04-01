package com.educandoweb.course.controller;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/home")
    public ResponseEntity<List<User>> getUser() {

        List<User> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }
}
