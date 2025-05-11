package com.hibernate.demo.durgesh;

import com.hibernate.demo.entities.StudentDurgesh;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
	private static SessionFactory factory;
	
	public static SessionFactory getInstance()
	{
		try
		{
			if(factory == null)
			{
				factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentDurgesh.class)
					.buildSessionFactory();
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException("Error in creaing session factory");
		}
		return factory;
	}
}
