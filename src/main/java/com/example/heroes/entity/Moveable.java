package com.example.heroes.entity;

public interface Moveable {
    int BASE_STEP = 1; // public static final

    void move();

    default void stay() {
        System.out.println("Stay");
    }
}
