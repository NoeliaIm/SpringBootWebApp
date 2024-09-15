package com.noeliaiglesias.springbootwebapp.controllers;

import com.noeliaiglesias.springbootwebapp.models.User;
import com.noeliaiglesias.springbootwebapp.models.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDate;
import java.util.List;

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

    @GetMapping("/users/list")
    public String list(ModelMap model) {

        model.addAttribute("title", "List of users");
        model.addAttribute("users", users());
        return "users/list";
    }

    @ModelAttribute("users")
    public List<UserDto> users() {
        UserDto userDto = new UserDto("Noelia", "Iglesias", "Boston", 8001, LocalDate.of(1978, 12, 31), "email@email.com");
        UserDto userDto1 = new UserDto("Valeria", "Maza", "California", 8001, LocalDate.of(1999, 11, 30), "email@email.com");
        UserDto userDto2 = new UserDto("Agustín", "Álvarez", "Chicago", 8001, LocalDate.of(2001, 3, 14), null);
        return List.of(userDto, userDto1, userDto2);

    }

}
