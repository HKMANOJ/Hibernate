package ManyTomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ManyToOne.AirtelSim;
import ManyToOne.User;

public class MainAns {

	public static void main(String[] args) {
		
		
		
		
		Answer a1=new Answer();
		a1.setAns("Python is used for data analytics, machine learning, and even design");
		
		Answer a2=new Answer();
		a2.setAns("python is programming language");
		
		ArrayList<Answer> list1=new ArrayList<Answer>();
		list1.add(a2);
		list1.add(a1);
		
		Answer a3=new Answer();
		a3.setAns("java is platform independent language");
		
		Answer a4=new Answer();
		a4.setAns("java is object oriented programming language");
		
		ArrayList<Answer> list2=new ArrayList<Answer>();
		list2.add(a4);
		list2.add(a3);
		
		Qusetion q1=new Qusetion();
		q1.setQuestion("What is java");

		
		Qusetion q2=new Qusetion();
		q2.setQuestion("What is python");
	
		


		Configuration crg=new Configuration().configure().addAnnotatedClass(Qusetion.class).addAnnotatedClass(Answer.class);
		SessionFactory sf =crg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		q1.setAns(list2);
		q2.setAns(list1);
		session.persist(q1);
		
		session.persist(q2);
		
		
		tx.commit();
		session.close();
		System.out.println("Done");
	}
	
	
	
	

}
