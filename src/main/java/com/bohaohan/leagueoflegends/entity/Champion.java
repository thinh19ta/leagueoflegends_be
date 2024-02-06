package com.bohaohan.leagueoflegends.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Champion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String nick;
    private String biography;
    private String image;
    private int age;
    private int difficulty;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "typeId")
    private Type type;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "areaId")
    private Area area;
    @ManyToMany(mappedBy = "champions")
    private Set<Cart> carts;

}
