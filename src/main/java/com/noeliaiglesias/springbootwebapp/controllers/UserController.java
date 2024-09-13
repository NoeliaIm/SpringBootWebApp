package com.noeliaiglesias.springbootwebapp.controllers;

import com.noeliaiglesias.springbootwebapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/users/details")
    public String details() {
        return "users/details";
    }

    @GetMapping("/users/user")
    public String user(User user) {
        user.setName("User 1");
        user.setCity("City 1");
        user.setCp(8001);
        return "users/user";
    }
}
