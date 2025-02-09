import com.hibernate.demo.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class PersistencePractical
{
	public static void main(String[] args)
	{
		Configuration conf = new Configuration().configure("cfg.xml").addAnnotatedClass(Employee.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		SessionFactory factory = conf.buildSessionFactory(reg);
		Session session = factory.openSession();
		session.beginTransaction();

		Employee emp =  new Employee();
		emp.setMarks(50);
		emp.setRollNo(1);
		emp.setName("Vivek");
		session.save(emp);

		emp.setMarks(60);

//		session.remove(emp);
		//besically the remove method is used to remove the data stored into table.

		session.getTransaction().commit();
		session.detach(emp);
		emp.setMarks(70);
	}

	/*
	1. when the object is created initially it is in transient state.
	2. when we save the data into database the object changes its state from transient to persistence state.
	3. when we stop the object from persistence state we can stop it using detach().
	*/
}
