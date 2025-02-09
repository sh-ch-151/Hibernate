package com.hibernate.demo.dao;

import com.hibernate.demo.entities.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRository extends JpaRepository<Alien, Integer>
{

}
