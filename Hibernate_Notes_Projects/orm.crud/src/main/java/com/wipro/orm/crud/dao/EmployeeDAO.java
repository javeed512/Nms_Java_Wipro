package com.wipro.orm.crud.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.Transaction;

import com.wipro.orm.crud.entity.Employee;

public class EmployeeDAO {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();
	
	// HQL with DML
	public   void  deleteByEname(String ename) {
		
		
		Transaction tr =	session.beginTransaction();
		
					
		Query  query =			session.createQuery("delete from Employee e  where e.ename =?1");
					
					query.setParameter(1, ename);
					
		int  count =	query.executeUpdate();
		
			System.out.println(count +"record deleted..");
		
		tr.commit();
	}

	  // Named Query
	public List<Employee> getAllEmployeeDetails() {

		Query<Employee> query = session.getNamedQuery("getAllEmployeeDetails");

		List<Employee> list = query.getResultList();

		return list;

	}
	
	public   List<Double>  getSalaries(){
		
		Query<Double> query = session.getNamedQuery("getSalaries");

		List<Double> list = query.getResultList();

		return list;
		
		
	}
	
	

	// Native SQL query
	public Employee getEmployeeSQL() {

		String sqlQuery = "select * from Employee_Info  where eid = ?1";

		
					//	session.createSQLQuery(sqlQuery)
		
		NativeQuery<Employee> nativeQuery = session.createNativeQuery(sqlQuery, Employee.class);

		nativeQuery.setParameter(1, 101);

		Employee emp = nativeQuery.getSingleResult();

		return emp;

	}

	// HQL
	public List<Employee> getAllEmployees() {

		// HQL select all records
		// String hqlQuery = "select e from Employee e";

		String hqlQuery = "select  e  from Employee e  where  e.salary > ?1 order by e.ename ";

		Query<Employee> query = session.createQuery(hqlQuery);

		query.setParameter(1, 30000.00);

		List<Employee> list = query.getResultList();

		return list;

	}

}
