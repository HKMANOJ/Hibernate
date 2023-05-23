package com.projectExp;


import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Empmain {
	
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("dssd");
		e1.setId(2);
		e1.setName("manoj");
		
		Configuration crg=new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf =crg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(e1);
		tx.commit();
		session.close();
		System.out.println("successfully");
		
		
	}

}
