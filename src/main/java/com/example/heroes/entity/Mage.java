package com.example.heroes.entity;


import com.example.heroes.enums.HeroType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Mage extends Hero {
    public Mage(@Value("${mage.health}") int health) {
        super(health, HeroType.MAGE.type);
        this.damage = new Random().nextInt(6, 10);
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
