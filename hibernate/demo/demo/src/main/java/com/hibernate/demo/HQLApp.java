package com.hibernate.demo;


import com.hibernate.demo.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.List;
import java.util.Random;

public class HQLApp
{
    public static void main(String[] args)
    {
        Configuration config = new Configuration().configure("cfg.xml").addAnnotatedClass(Employee.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        SessionFactory factory = config.buildSessionFactory(reg);
        Session session = factory.openSession();
        session.beginTransaction();
		Query q = session.createQuery("select name, marks from Employee where rollNo = 7");
       Object[] e = (Object[]) q.uniqueResult();
       for(Object e1 : e)
       {
           System.out.println(e1);
       }

//        int b = 40;
//        Query q = session.createQuery("select sum(marks) from Employee where marks > :b");
//        q.setParameter("b", b);
//        Long mark = (Long) q.uniqueResult();
//        System.out.println(mark);
//
//       NativeQuery query = session.createNativeQuery("select * from employee where marks > 40");
//       List<Object[]> rows = query.list();
//        for(Object[] row : rows)
//        {
//            Employee emp = new Employee();
//            emp.setRollNo((Integer)row[0]);
//            emp.setMarks((Integer) row[1]);
//            emp.setName(row[2].toString());
//            System.out.println(emp);
//        }
//        session.getTransaction().commit();

//        Random rand = new Random();
//        for(int i = 0; i < 50; i++)
//        {
//            Employee e = new Employee();
//            e.setRollNo(i + 4);
//            e.setName("Shweta");
//            e.setMarks(rand.nextInt(50));
//            session.save(e);
//        }
//	    session.getTransaction().commit();
    }
}
