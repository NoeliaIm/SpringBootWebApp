package com.noeliaiglesias.springbootwebapp.models;


import lombok.Data;

@Data
public class User {
    private String name;
    private String city;
    private int cp;
}
