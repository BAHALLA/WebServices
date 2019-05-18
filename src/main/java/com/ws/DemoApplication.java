package com.ws;

import com.ws.dao.CompteRepository;
import com.ws.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private CompteRepository compteRepository;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        compteRepository.save(new Compte(null,Math.random()*9000,new Date()));
        compteRepository.save(new Compte(null,Math.random()*9000,new Date()));
        compteRepository.save(new Compte(null,Math.random()*9000,new Date()));

        compteRepository.findAll().forEach(c -> {
            System.out.println(c.getSolde());
        });
    }
}
