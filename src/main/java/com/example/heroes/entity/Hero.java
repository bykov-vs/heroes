package com.example.heroes.entity;


import com.example.heroes.enums.HeroType;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Hero implements Moveable {
    public String type = HeroType.HERO.type;
    public int health;
    public int damage;

    public Hero() {

    }

    public Hero(int health) {
        this.health = health;
    }

    public Hero(int health, String type) {
        this.type = type;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return String.format(
                "I am a %s with health '%s' and damage '%s'",
                type, health, damage
        );
    }

    public abstract int attack();
}