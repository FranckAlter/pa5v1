package com.example.flixbee.dto;

import com.example.flixbee.domain.User;
import lombok.Data;


@Data
public class AssociationDTO {


    private String id;
    private String email;
    private User user_owner;
    private String description;
    private String siren;
}
