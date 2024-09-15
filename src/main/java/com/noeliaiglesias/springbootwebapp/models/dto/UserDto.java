package com.noeliaiglesias.springbootwebapp.models.dto;

import com.noeliaiglesias.springbootwebapp.utils.DateUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String name;

    private String surname;

    private String city;

    private int cp;

    private LocalDate birthDate;

    private String email;

    public String getBirthDate() {
        return DateUtils.getFormattedLocalDate(Objects.requireNonNullElseGet(birthDate, LocalDate::now));
    }

    public String getFullName() {
        return name + " " + surname;
    }

}
