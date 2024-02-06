package com.bohaohan.leagueoflegends.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    private List<Champion> champions;
}
