package com.OneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.OneToOne.Laptop;
import com.OneToOne.Student;

public class Store {

	public static void main(String[] args) {
		
Employee e1=new Employee();
e1.setEname("das");

Employee e2=new Employee();
e2.setEname("dsa");

ArrayList<Employee> list=new ArrayList<Employee>();
list.add(e2);
list.add(e1);
		
		Address a1=new Address();
		a1.setCity("Shimogga");
		a1.setState("Karnataka");
		a1.setEmp(list);
		
		

		Configuration crg=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);
		SessionFactory sf =crg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
//		
		
		
		session.persist(a1);
		tx.commit();
		session.close();
		System.out.println("Done");
		
	}
}
