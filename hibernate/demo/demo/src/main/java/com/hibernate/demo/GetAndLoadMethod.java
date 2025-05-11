package com.hibernate.demo;


import com.hibernate.demo.entities.Employee;
import jakarta.persistence.Embeddable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class GetAndLoadMethod
{
	public static void main(String[] args)
	{
		Configuration conf = new Configuration().configure("cfg.xml").addAnnotatedClass(Employee.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		SessionFactory fact = conf.buildSessionFactory(reg);
		Session session = fact.openSession();
		session.beginTransaction();

		Employee emp = session.get(Employee.class, 1);
		System.out.println(emp);
		
//		emp = session.load(Employee.class, 1);
//		System.out.println(emp);

		session.getTransaction().commit();
	}
}
