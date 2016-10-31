package info.michalak.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyTest {
	public static void main(String[] args) {
		
		
		
		Door door1 = new Door();
		door1.setColor("red");
//		Door door2 = new Door();
//		door2.setColor("blue");
		
		
		KeyCard keyCard1 = new KeyCard();
		keyCard1.setAccessLevel("all");
		KeyCard keyCard2 = new KeyCard();
		keyCard2.setAccessLevel("none");
		
		
		
		door1.getKeyList().add(keyCard1);
		door1.getKeyList().add(keyCard2);
		
		
		SessionFactory sessionFactorynew = new Configuration().configure().buildSessionFactory();  //Creates sessionsFactory
		Session session = sessionFactorynew.openSession();   // can be reuse TAKES LOT OF RESOURCES // used to push and pull data

		session.beginTransaction();	// "Connects to DB" !!!*** Can be done ONLY ONCE****!!!!
		
	
		//***!!!Each object MUST BE SAVED otherwise hibernate informs about transient object!!!***
		
		session.save(door1);
		session.save(keyCard1);
		session.save(keyCard2);
		
//		session.save(door2);
		
		session.getTransaction().commit();
				
//		
		
		//closing session
		session.close(); //AS IN DB SESSION SEEDS TO BE CLOSED /usualy in try catch / rollback
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
