package com.noeliaiglesias.springbootwebapp.controllers;

import com.noeliaiglesias.springbootwebapp.models.dto.ParamDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/requestparams")
public class RequestParamsController {

    @GetMapping("/details")
    public ParamDto details(@RequestParam String name, @RequestParam String city, @RequestParam int cp) {
        ParamDto paramDto = new ParamDto();
        paramDto.setName(name);
        paramDto.setCity(city);
        paramDto.setCp(cp);
        return paramDto;
    }

    @GetMapping("/requestDetails")
    public ParamDto requestDetails(HttpServletRequest request) {
        ParamDto paramDto = new ParamDto();
        paramDto.setName(request.getParameter("name"));
        paramDto.setCity(request.getParameter("city"));
        paramDto.setCp(Integer.parseInt(request.getParameter("cp")));
        return paramDto;
    }
}
