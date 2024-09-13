package com.noeliaiglesias.springbootwebapp.controllers;

import com.noeliaiglesias.springbootwebapp.models.User;
import com.noeliaiglesias.springbootwebapp.models.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

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

    @GetMapping("/users/userdto")
    public String userDto(UserDto userDto) {
        userDto.setName("Noelia");
        userDto.setSurname("Iglesias");
        userDto.setCity("City 1");
        userDto.setBirthDate(LocalDate.of(1980, 12, 31));
        userDto.setCp(8001);
        userDto.setEmail("hola@email.com");
        return "users/userdto";
    }
}
