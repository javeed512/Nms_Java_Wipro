package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Address;
import com.hexaware.mappings.entity.Student;

/**
 * Hello world!
 *
 */
public class OneToOneMapping {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		System.out.println(session);

		
		Address address = new Address();
		address.setAddressId(30);
		address.setCity("Old City");
		

		//Student student = new Student(101, "Rahul", address);
		
		//Address address = new Address(29,"Noida",student);
			
		
		//address.setStudent(student);

		Transaction txn = session.beginTransaction();

		//session.persist(student);
		
		Student student1 =		session.get(Student.class, 101);

		System.out.println(student1.getStudentName());
		System.out.println(student1.getAddress().getCity());
		
		txn.commit();

	}
}
