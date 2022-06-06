package com.example.flixbee.service;

import com.example.flixbee.repository.AssociationRepository;
import com.example.flixbee.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class AssociationService {

    @Autowired
    private AssociationRepository associationRepository;
}
