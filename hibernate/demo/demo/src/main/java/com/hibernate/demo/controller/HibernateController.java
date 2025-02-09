package com.hibernate.demo.controller;

import com.hibernate.demo.dao.AlienRository;
import com.hibernate.demo.entities.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HibernateController
{
    @Autowired
    private AlienRository repo;

    @GetMapping("/save")
    public Alien save()
    {
        Alien alien = new Alien();
        alien.setAid(1);
//        alien.setName("Shweta");
        alien.setColor("Red");
        Alien a1 = repo.save(alien);
        return a1;
    }
}
