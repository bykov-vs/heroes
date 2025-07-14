package com.example.heroes.dao;

import com.example.heroes.dao.dto.MageDto;
import com.example.heroes.entity.Mage;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MageDao {
    private List<Mage> mages;
    private int COUNT_MAGE = 0;

    {
        mages = new ArrayList<>();
    }

    public List<Mage> getMages() {
        return mages;
    }

    public Mage getMage(int id) {
        return mages.stream()
                .filter(mage -> mage.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addMage(MageDto mageDto) {
        Mage mage = new Mage(
                ++COUNT_MAGE,
                mageDto.health(),
                mageDto.name(),
                mageDto.damage()
        );

        mages.add(mage);
    }

    public void updateMage(Integer id, MageDto mageDto) {
        Mage oldMage = getMage(id);

        oldMage.setName(mageDto.name());
        oldMage.setDamage(mageDto.damage());
        oldMage.setHealth(mageDto.health());
    }

    public void deleteMage(Integer id) {
        mages.removeIf(mage -> mage.getId() == id);
    }
}
