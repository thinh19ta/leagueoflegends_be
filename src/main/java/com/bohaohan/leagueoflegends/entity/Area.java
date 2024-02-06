package com.bohaohan.leagueoflegends.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private List<Champion> champions;
}
