package com.example.heroes.dao;

import com.example.heroes.entity.Mage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MageRepository
        extends JpaRepository<Mage, Integer> {
}
