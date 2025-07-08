package com.example.heroes.enums;

public enum HeroType {
    HERO("hero"),
    WARRIOR("warrior"),
    MAGE("mage");

    public final String type;

    HeroType(String type) {
        this.type = type;
    }
}

