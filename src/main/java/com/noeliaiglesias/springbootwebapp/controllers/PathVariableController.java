package com.noeliaiglesias.springbootwebapp.controllers;

import com.noeliaiglesias.springbootwebapp.models.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
