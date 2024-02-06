package com.bohaohan.leagueoflegends.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "userName")
    private String userName;
    private String password;
    private String role;
    private String email;
    private String image;

    @Column(name = "birthDay")
    private Date birthDay;
    @OneToOne(mappedBy = "account")
    private Cart cart;
}
