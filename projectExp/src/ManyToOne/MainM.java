package ManyToOne;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.OneToMany.Address;
import com.OneToMany.Employee;

public class MainM {

	public static void main(String[] args) {


	
	
	AirtelSim a1=new AirtelSim();
	a1.setSimtype("AIRTEL4G");
	
	
	User u1=new User();
	u1.setUrName("manoj");
	
	User u2=new User();
	u2.setUrName("madan");
	
	
	

	Configuration crg=new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(AirtelSim.class);
	SessionFactory sf =crg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	
	u1.setSim(a1);
	u2.setSim(a1);
	
	session.persist(u1);

	session.persist(u2);
	tx.commit();
	session.close();
	System.out.println("Done");
		
	}

}
