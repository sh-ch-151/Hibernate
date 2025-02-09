package com.hibernate.demo;

import com.hibernate.demo.entities.Alien;
import com.hibernate.demo.entities.Laptop;
import com.hibernate.demo.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class MappingDriver
{
    public static void main(String[] args)
    {
        Laptop laptop = new Laptop();
        laptop.setlId(105);
        laptop.setlName("HP");

        Student student = new Student();
        student.setRollNo(2);
        student.setName("Shweta");
        student.setMarks(90);
        student.getLaptop().add(laptop);

        laptop.getStudents().add(student);

        Configuration conf = new Configuration().configure("cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
//        session.save(laptop);
//        session.save(student);
        Student s = session.get(Student.class, 2);
//        List<Laptop> laps = s.getLaptop();
//        for(Laptop l : laps)
//        {
//            System.out.println(l.getlId());
//        }
        System.out.println(s);
        tx.commit();
    }
}
