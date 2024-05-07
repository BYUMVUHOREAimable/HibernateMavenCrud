package com.sjprogramming.hibernateex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		// configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		// hibernate.cfg.xml is loaded by default so no need to include but when you
		// change it you have to include it in configure
		configuration.configure().addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// to save the data
		Employee employee = new Employee();
		//employee.setId(1);
		employee.setName("BYUMVUHORE Aimable");
		employee.setMail("aimablebyumvuhore@gmail.com");
		employee.setSalary(89000);

		Employee employee1 = new Employee();
		//employee1.setId(2); //will be auto generated
		employee1.setName("IRADUKUNDA Celeverien");
		employee1.setMail("celeverieniradukunda@gmail.com");
	    employee1.setSalary(7900);
	    
	    Employee employee2 = new Employee();
		employee2.setName("NIYITEGEKA Erizabeth");
		employee2.setMail("erizabethniyitegeka@gmail.com");
		employee2.setSalary(19000);

		Transaction transaction = session.getTransaction();
		transaction.begin();
		//session.save(employee);
		session.persist(employee);
		session.persist(employee1);
		session.persist(employee2);

		// fetching
		//Employee emp=session.load(Employee.class, 1);
		 Employee emp=session.get(Employee.class, 1);
		 Employee emp1=session.get(Employee.class, 2);
		 Employee emp2=session.get(Employee.class, 3);
		 System.out.println(emp);
		 System.out.println(emp1);
		 System.out.println(emp2);

		// to update //first you fetch the data
		// Employee emp=session.get(Employee.class, 2);
		// emp.setName("NIYITEGEKA Erizabeth");
		// emp.setSalary(72000);
		// session.update(emp);

		// to delete //first you fetch
		// Employee emp=session.get(Employee.class, 2);
		// session.delete(emp);

		transaction.commit();

	}

}
