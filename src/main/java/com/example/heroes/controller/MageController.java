package com.example.heroes.controller;

import com.example.heroes.dao.MageDao;
import com.example.heroes.dao.MageRepository;
import com.example.heroes.dao.dto.MageDto;
import com.example.heroes.entity.Mage;
import com.example.heroes.entity.MageArena;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mages")
public class MageController {

    private final MageRepository repository;
    private final MageArena arena;

    public MageController(MageRepository repository, MageArena arena) {
        this.repository = repository;
        this.arena = arena;
    }

    @GetMapping
    public List<Mage> getAllMages() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Mage getMage(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public void addMage(
            @RequestBody MageDto mageDto
    ) {
        Mage mage = new Mage(
                mageDto.health(),
                mageDto.name(),
                mageDto.damage()
        );
        repository.save(mage);
    }

    @PutMapping("/{id}")
    public void updateMage(
            @PathVariable Integer id,
            @RequestBody MageDto mageDto) {
        Mage mage = new Mage(
                id,
                mageDto.health(),
                mageDto.name(),
                mageDto.damage()
        );
        if (repository.existsById(id)) {
            repository.save(mage);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteMage(
            @PathVariable Integer id
    ) {
        repository.deleteById(id);
    }

    @GetMapping("/startFight")
    public void startFight(
            @RequestParam Integer mage1,
            @RequestParam Integer mage2
    ) {
        Mage hero1 = repository.findById(mage1).orElse(null);
        Mage hero2 = repository.findById(mage2).orElse(null);

        arena.startFight(hero1, hero2);
    }
}
