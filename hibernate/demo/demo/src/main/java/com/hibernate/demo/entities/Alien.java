package com.hibernate.demo.entities;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Alien")

@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _aid;
    private String _name;
    private String _color;

    public int getAid()
    {
        return _aid;
    }

    public void setAid(int _aid)
    {
        this._aid = _aid;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String _color) {
        this._color = _color;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "_aid=" + _aid +
                ", _name='" + _name + '\'' +
                ", _color='" + _color + '\'' +
                '}';
    }
}
