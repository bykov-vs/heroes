package com.example.heroes.entity;

import com.example.heroes.dao.MageFightRepository;
import org.springframework.stereotype.Component;

@Component
public class MageArena {
    private final MageFightRepository repository;

    public MageArena(MageFightRepository repository) {
        this.repository = repository;
    }

    public void startFight(Mage firstHero, Mage secondHero) {
        int round = 1;
        int damage;
        while (firstHero.health > 0 && secondHero.health > 0) {
            System.out.println("# ROUND " + round);

            damage = firstHero.attack();
            if (damage == 0) {
                System.out.println("# 1st hero missed :(");
            }else {
                secondHero.health -= damage;
                System.out.println("# 1st hero make a " + damage + " damage. 2nd hero health is " + secondHero.health);
            }

            damage = secondHero.attack();
            if (damage == 0) {
                System.out.println("# 2nd hero missed :(");
            }else {
                firstHero.health -= damage;
                System.out.println("# 2nd hero make a " + damage + " damage. 1st hero health is " + firstHero.health);
            }
            System.out.println();
            round++;
        }
        String result = "";
        if (firstHero.health <= 0 && secondHero.health <= 0) {
            result = "FIGHT RESULT: DRAW";
        } else if (firstHero.health <= 0 ) {
            result = "FIGHT RESULT: 2ND hero WIN";
        } else {
            result = "FIGHT RESULT: 1ST hero WIN";
        }
        MageFight mageFight = new MageFight();
        mageFight.setFirstHero(firstHero);
        mageFight.setSecondHero(secondHero);
        mageFight.setResult(result);

        repository.save(mageFight);
    }
}
