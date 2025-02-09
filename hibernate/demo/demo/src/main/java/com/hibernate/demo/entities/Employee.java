package com.hibernate.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee
{
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rollNo;
    private String name;
    private int marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "rollNo=" + rollNo +
            ", name='" + name + '\'' +
            ", marks=" + marks +
            '}';
    }
}
