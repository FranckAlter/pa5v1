package com.example.flixbee.domain.association;

import com.example.flixbee.domain.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Data
@Accessors
@Table(name="associations")
public class Association {

    @GeneratedValue
    @Id
    private String id;

    @Column(unique = true)
   private String email;

    @OneToOne
   private User user_owner;

    @Column(unique = true)
   private String description;

    @Column(unique = true)
   private String siren;

   public Association (){

    }
}
