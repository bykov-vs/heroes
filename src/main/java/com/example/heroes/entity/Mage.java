package com.example.heroes.entity;


import com.example.heroes.enums.HeroType;
import jakarta.persistence.*;

import java.util.Random;

@Entity
@Table(name = "mages")
public class Mage extends Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Mage() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mage(Integer id, int health, String name, Integer damage) {
        super(health, HeroType.MAGE.type);
        this.damage = damage;
        this.id = id;
        this.name = name;
    }

    public Mage(int health, String name, Integer damage) {
        super(health, HeroType.MAGE.type);
        this.damage = damage;
        this.name = name;
    }

    @Override
    public int attack() {
        int isMiss = new Random().nextInt(2);
        if (isMiss == 0) {
            return 0;
        } else {
            return damage;
        }
    }


    @Override
    public void move() {
        System.out.println(type + " moved " + BASE_STEP + 2);
    }
}
