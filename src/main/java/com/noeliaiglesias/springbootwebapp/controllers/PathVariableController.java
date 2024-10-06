package com.noeliaiglesias.springbootwebapp.controllers;

import com.noeliaiglesias.springbootwebapp.models.User;
import com.noeliaiglesias.springbootwebapp.models.dto.ParamDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/pathvariable")
public class PathVariableController {

    @Value("${config.username}")
    private String username;
    @Value("${config.welcome.message}")
    private String welcomeMessage;
    @Value("${config.listOfValues}")
    private String[] listOfValues;


    @GetMapping("/details/{name}/{city}/{cp}")
    public ParamDto details(@PathVariable String name, @PathVariable String city, @PathVariable int cp) {
        ParamDto paramDto = new ParamDto();
        paramDto.setName(name);
        paramDto.setCity(city);
        paramDto.setCp(cp);
        return paramDto;
    }

    @PostMapping("/details")
    public User createUser(@RequestBody User user) {
        User userCreated = new User();
        userCreated.setName(user.getName().toUpperCase());
        userCreated.setCity(user.getCity().toUpperCase());
        userCreated.setCp(user.getCp());
        return userCreated;
    }

    @GetMapping("/config")
    public Map<String, Object> getConfig(@Value("${config.password}") String password, @Value("${config.code}") int code) {
        return Map.of("username", username, "welcomeMessage", welcomeMessage, "listOfValues", listOfValues, "password", password, "code", code);
    }
}
