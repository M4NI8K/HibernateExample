package info.michalak;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(2);
		user.setUserName("FirstName");
		user.setJoinedDate(new Date());
		
		SessionFactory sessionFactorynew = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactorynew.openSession();
	
		session.beginTransaction();
		session.save(user);
		
		session.getTransaction().commit();
	}
	
	
}
