package com.example.jwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("api/v1/")
public class RestApiController {
    @GetMapping("home")
    public String home() {
        return "<h1>home</h1>";
    }

    @GetMapping("user")
    public String user() {
        return "<h1>user</h1>";
    }

    @GetMapping("manager")
    public String manager() {
        return "<h1>manager</h1>";
    }

    @GetMapping("admin")
    public String admin() {
        return "<h1>admin</h1>";
    }
}
