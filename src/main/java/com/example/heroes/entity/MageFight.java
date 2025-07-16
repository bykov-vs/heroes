package com.example.heroes.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class MageFight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Mage firstHero;

    @ManyToOne
    private Mage secondHero;

    private String result;

    public MageFight() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Mage getFirstHero() {
        return firstHero;
    }

    public void setFirstHero(Mage firstHero) {
        this.firstHero = firstHero;
    }

    public Mage getSecondHero() {
        return secondHero;
    }

    public void setSecondHero(Mage secondHero) {
        this.secondHero = secondHero;
    }
}
