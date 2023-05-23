package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.projectExp.Employee;

public class Mainc {

	public static void main(String[] args) {

		
		
		Laptop l1=new Laptop();
		l1.setBrand("DELL");
		
		Student s1=new Student();
		s1.setStudentname("manoj");
		s1.setLap(l1);
		
		

		Configuration crg=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf =crg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(l1);
		session.save(s1);
		
		
		tx.commit();
		session.close();
		System.out.println("successfully");
		
		
	}

}
