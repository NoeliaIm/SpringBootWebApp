package com.noeliaiglesias.springbootwebapp.controllers;



import com.noeliaiglesias.springbootwebapp.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController //para prescindir de la anotación @Controller y de la anotación @ResponseBody
//@Controller
@RequestMapping("/api/users")
public class UserRestController {

    //@RequestMapping(value = "/details", method = RequestMethod.GET)
    @GetMapping("/details")
    //@ResponseBody
    public Map<String, Object> users() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "User 1");
        map.put("city", "City 1");
        map.put("CP", 8001);
        return map;
    }

    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setName("User 1");
        user.setCity("City 1");
        user.setCp(8001);
        return user;
    }
}
