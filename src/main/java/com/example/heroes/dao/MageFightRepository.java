package com.example.heroes.dao;

import com.example.heroes.entity.MageFight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MageFightRepository extends JpaRepository<MageFight, Integer> {
}
