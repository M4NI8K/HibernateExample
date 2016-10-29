package info.michalak;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	public static void main(String[] args) {
		
		//address Object
		Address address = new Address();
		address.setCity("111");
		address.setPostcode("222");
		address.setStreet("3333");
		
		//address2 Object
		Address address2 = new Address();
		address2.setCity("4444");
		address2.setPostcode("555");
		address2.setStreet("666");
		
		
		
		//User Object
		UserDetails user = new UserDetails();
		
//		user.setUserId(3);  			//Manually applies ID
		user.setUserName("FirstName");
		user.setJoinedDate(new Date());
		
		//Creates 2nd addresses 
		user.setAddress(address);
		user.setOfficeAddress(address);
		
		
		
		//adds addresses to user set 
		user.getListOfAddAddresses().add(address);
		user.getListOfAddAddresses().add(address2);

//SENDING OBJECT		
			
		//Creating factory + new session 		
		SessionFactory sessionFactorynew = new Configuration().configure().buildSessionFactory();  //Creates sessionsFactory
		Session session = sessionFactorynew.openSession();   // can be reuse TAKES LOT OF RESOURCES // used to push and pull data
			
		session.beginTransaction();	// "Connects to DB"
		session.save(user);
			
		session.getTransaction().commit();
		
//		
		
		
		
		
		
		
		
		
		
		
		
		//closing session
		session.close(); //AS IN DB SESSION SEEDS TO BE CLOSED /usualy in try catch / rollback
		user = null;
		
		
		
		
//RETURNING OBJECT		
		//Proxy class  https://www.youtube.com/watch?v=RmnrgocuivQ&list=PL4AFF701184976B25&index=13#t=507.193562
		
		
		//Reopening session 
		session = sessionFactorynew.openSession();   // used to push and pull data
		
//lazy end eger initialisation
		// proxy class 
		
		
		session.beginTransaction(); // "Connects to DB"
//	user = (UserDetails) session.get(UserDetails.class, 3);  //  CAst + ClassName + Primary Key
		
//	System.out.println(user.getUserId()+  " " + user.getUserName());
		
		//closing session
		session.close();
		
		
		
		
		
	}
	
	
}
