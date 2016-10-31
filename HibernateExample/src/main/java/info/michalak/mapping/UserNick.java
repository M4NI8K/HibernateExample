package info.michalak.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// ONE TO ONE EXAMPLE

@Entity
public class UserNick {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int UserID;
	
	private String nick;
	
	//Getters and Setters
	public int getUserID() {
		return UserID;
	}
	public String getNick() {
		return nick;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	
	
	
	
}
