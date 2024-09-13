package com.noeliaiglesias.springbootwebapp.controllers;



import com.noeliaiglesias.springbootwebapp.models.User;
import com.noeliaiglesias.springbootwebapp.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.*;


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

    @GetMapping("/userdto")
    public UserDto userDto() {
        UserDto user = new UserDto();
        user.setName("Noelia");
        user.setSurname("Iglesias");
        user.setCity("City 1");
        user.setCp(8001);
        user.setBirthDate(LocalDate.of(2008, 2,9));
        return user;
    }

    @GetMapping("/list")
    public List<UserDto> list() {
        UserDto user = new UserDto();
        user.setName("Noelia");
        user.setSurname("Iglesias");
        user.setCity("City 1");
        user.setCp(8001);
        user.setBirthDate(LocalDate.of(2008, 2,9));

        UserDto user2 = new UserDto();
        user2.setName("Valeria");
        user2.setSurname("Martinez");
        user2.setCity("City 2");
        user2.setCp(8002);
        user2.setBirthDate(LocalDate.of(2005, 2,9));

        return Arrays.asList(user, user2);
    }
}
