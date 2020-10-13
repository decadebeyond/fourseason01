package com.decademo.fourseason01.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    private String username;
    private String password;
    private String nickname;
    private String phonenumber;
    private String email;

}
