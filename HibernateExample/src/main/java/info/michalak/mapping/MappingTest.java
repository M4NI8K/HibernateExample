package info.michalak.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import info.michalak.ManyToMany.KeyCard;

public class MappingTest {
	public static void main(String[] args) {
		
		//Key objects Created
		KeyCard key1 = new KeyCard();
		key1.setAccessLevel("silver");
		KeyCard key2 = new KeyCard();
		key2.setAccessLevel("gold");
		
		//Car objects creating

		Vechicle vechicle2 = new Vechicle();
		vechicle2.setVechicalName("2nd Car");
								
		Vechicle vechicle3 = new Vechicle();
		vechicle3.setVechicalName("3rd Car");
		
			//Car objects + Key
		
			
	//User Nick
		UserNick nick = new UserNick();
		nick.setNick("MyNick");
		
		
		
		// Driver
		Driver driver = new Driver();
		driver.setDriverName("Bob Driver");
		
		
		
		//One To One
		driver.setUserNick(nick);	//User Nick
	

		//one to many
		driver.getVechicleList().add(vechicle2);
		driver.getVechicleList().add(vechicle3);
		vechicle2.setDriver(driver);
		vechicle3.setDriver(driver);
	
		SessionFactory sessionFactorynew = new Configuration().configure().buildSessionFactory();  //Creates sessionsFactory
		Session session = sessionFactorynew.openSession();   // can be reuse TAKES LOT OF RESOURCES // used to push and pull data
			
	
		
		
		
		
		
		session.beginTransaction();	// "Connects to DB" !!!*** Can be done ONLY ONCE****!!!!
		
		
		//***!!!Each object MUST BE SAVED otherwise hibernate informs about transient object!!!***
		
		session.save(nick);
		session.save(driver);
		
	
		session.save(vechicle2);
		session.save(vechicle2);
		
		session.getTransaction().commit();
		
		
//		

		
		
		//closing session
		session.close(); //AS IN DB SESSION SEEDS TO BE CLOSED /usualy in try catch / rollback
		
	}
}
