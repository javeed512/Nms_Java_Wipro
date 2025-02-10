package com.wipro.orm.crud.presentation;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.orm.crud.dao.HibernateUtil;
import com.wipro.orm.crud.entity.Employee;

public class CrudOperations {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		
		 //  For DML Operations always begin transaction and commit
		Transaction tr = session.beginTransaction();

		// insert operation

		//Employee emp = new Employee(101, "king", 50000);
		
		
		// update  operation
		
		Employee emp =   	session.get(Employee.class, 101);
		
			System.out.println(emp);
			
			/*
			 * emp.setEname("king khan"); emp.setSalary(750000);
			 * 
			 * //session.saveOrUpdate(emp); Serializable ser = session.save(emp); // insert
			 * or update
			 * 
			 * 
			 * System.out.println(ser.toString() +" employee record affected..");
			 */
		
			// delete operation
			
			session.delete(emp);
			
			System.out.println("record deleted successfully...");
			
			
		tr.commit();

	}

}
