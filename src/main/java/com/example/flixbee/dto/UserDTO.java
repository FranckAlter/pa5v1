package com.example.flixbee.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class UserDTO {

    private String id;
    private String email;
    private String name;
    private String firstname;
    private String password;
}
