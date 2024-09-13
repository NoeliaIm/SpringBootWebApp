package com.noeliaiglesias.springbootwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class ProvidersController {

    @GetMapping("/providers/details")
    public String details(Model model) {
        model.addAttribute("name", "Provider 1");
        model.addAttribute("city", "City 1");
        model.addAttribute("CP", "08001");
        return "providers/details";
    }

    @GetMapping("/providers/list")
    public String list(Map<String, Object> map) {
        map.put("name", "Provider 1");
        map.put("city", "City 1");
        map.put("CP", 8001);
        return "providers/list";
    }
}
