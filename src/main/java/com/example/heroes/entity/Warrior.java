package com.example.heroes.entity;

import com.example.heroes.enums.HeroType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Warrior extends Hero {
    public Warrior(@Value("${warrior.health}") int health) {
        super(health, HeroType.WARRIOR.type);
        this.damage = new Random().nextInt(1, 5);
    }

    @Override
    public int attack() {
        int isMiss = new Random().nextInt(5);
        if (isMiss == 0) {
            return 0;
        } else {
            return damage;
        }
    }

    @Override
    public void move() {
        System.out.println(type + " moved " + BASE_STEP + 4);
    }
}

