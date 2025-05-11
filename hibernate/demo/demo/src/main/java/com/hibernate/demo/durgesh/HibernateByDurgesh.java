package com.hibernate.demo.durgesh;

import com.hibernate.demo.entities.StudentDurgesh;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateByDurgesh
{
	public static void main(String[] args)
	{
		SessionFactory factory = HibernateUtil.getInstance();
		
		StudentDurgesh stu = new StudentDurgesh();
		stu.setId(1);
		stu.setName("Shweta");
		stu.setCollege("Atharva");
		stu.setFatherName("Sandesh");
		stu.setAbout("Completed B.E");
		stu.setPhone("5987412305");
		stu.setActive(true);
		
		Session session = factory.openSession();
		Transaction tran = null;
		try
		{
			tran = session.beginTransaction();
			session.save(stu);//TODO use persist
			tran.commit();
			System.out.println("Add data successufully");
		}
		catch(Exception e)
		{
			if(tran != null)
			{
				tran.rollback();
			}
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
}
