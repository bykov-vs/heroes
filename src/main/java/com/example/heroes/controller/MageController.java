package com.example.heroes.controller;

import com.example.heroes.dao.MageDao;
import com.example.heroes.dao.dto.MageDto;
import com.example.heroes.entity.Mage;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mages")
public class MageController {

    private final MageDao mageDao;

    public MageController(MageDao mageDao) {
        this.mageDao = mageDao;
    }

    @GetMapping
    public List<Mage> getAllMages() {
        return mageDao.getMages();
    }

    @GetMapping("/{id}")
    public Mage getMage(@PathVariable Integer id) {
        return mageDao.getMage(id);
    }

    @PostMapping
    public void addMage(
            @RequestBody MageDto mageDto
    ) {
        mageDao.addMage(mageDto);
    }

    @PutMapping("/{id}")
    public void updateMage(
            @PathVariable Integer id,
            @RequestBody MageDto mageDto) {
        mageDao.updateMage(id, mageDto);
    }

    @DeleteMapping("/{id}")
    public void deleteMage(
            @PathVariable Integer id
    ) {
        mageDao.deleteMage(id);
    }
}
