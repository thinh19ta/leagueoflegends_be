package com.bohaohan.leagueoflegends.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cart_champion", joinColumns = @JoinColumn(name = "cartId"), inverseJoinColumns = @JoinColumn(name = "championId"))
    private Set<Champion> champions;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accountId")
    private Account account;

}
