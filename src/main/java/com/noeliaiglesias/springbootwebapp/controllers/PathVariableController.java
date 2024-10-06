package com.noeliaiglesias.springbootwebapp.controllers;

import com.noeliaiglesias.springbootwebapp.models.User;
import com.noeliaiglesias.springbootwebapp.models.dto.ParamDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pathvariable")
public class PathVariableController {

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
}
