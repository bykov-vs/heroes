//package com.example.heroes.entity;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Arena {
//    @Autowired
//    private final Warrior firstHero;
//
//    private final Mage secondHero;
//
//    public Arena(
//            Warrior firstHero,
//            Mage secondHero
//    ) {
//        this.firstHero = firstHero;
//        this.secondHero = secondHero;
//    }
//
//    @PostConstruct
//    public void startFight() {
//        int round = 1;
//        int damage;
//        while (firstHero.health > 0 && secondHero.health > 0) {
//            System.out.println("# ROUND " + round);
//
//            damage = firstHero.attack();
//            if (damage == 0) {
//                System.out.println("# 1st hero missed :(");
//            }else {
//                secondHero.health -= damage;
//                System.out.println("# 1st hero make a " + damage + " damage. 2nd hero health is " + secondHero.health);
//            }
//
//            damage = secondHero.attack();
//            if (damage == 0) {
//                System.out.println("# 2nd hero missed :(");
//            }else {
//                firstHero.health -= damage;
//                System.out.println("# 2nd hero make a " + damage + " damage. 1st hero health is " + firstHero.health);
//            }
//            System.out.println();
//            round++;
//        }
//        if (firstHero.health <= 0 && secondHero.health <= 0) {
//            System.out.println("FIGHT RESULT: DRAW");
//        } else if (firstHero.health <= 0 ) {
//            System.out.println("FIGHT RESULT: 2ND hero WIN");
//        } else {
//            System.out.println("FIGHT RESULT: 1ST hero WIN");
//        }
//    }
//}
