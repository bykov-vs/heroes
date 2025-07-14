package com.example.heroes;

import com.example.heroes.entity.Mage;
import com.example.heroes.entity.Warrior;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HeroesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(HeroesApplication.class, args);
	}

}
