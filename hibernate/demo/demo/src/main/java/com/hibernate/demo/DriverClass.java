package com.hibernate.demo;

import com.hibernate.demo.entities.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DriverClass
{
    public static void main(String[] args)
    {
        Configuration conf = new Configuration().configure("cfg.xml").addAnnotatedClass(Alien.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(reg);

        Session session1 = sf.openSession();
        session1.beginTransaction();

        Alien alien = session1.get(Alien.class, 1);
        System.out.println(alien);
        session1.getTransaction().commit();
        session1.close();

        Session session2 = sf.openSession();
        session2.beginTransaction();

        alien = session2.get(Alien.class, 1);
        System.out.println(alien);

        session2.getTransaction().commit();
        session2.close();
    }
}













































































































