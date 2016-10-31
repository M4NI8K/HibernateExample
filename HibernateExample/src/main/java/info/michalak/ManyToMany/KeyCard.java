package info.michalak.ManyToMany;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import info.michalak.mapping.Vechicle;

@Entity
public class KeyCard {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cardID;
	
	private String accessLevel;
		
	
//	private Door doorList = new Door();

	
	
	
	
	
	
	public int getCardID() {
		return cardID;
	}

	public void setCardID(int cardID) {
		this.cardID = cardID;
	}

	public String getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

//	public Door getDoorList() {
//		return doorList;
//	}
//
//	public void setDoorList(Door door) {
//		this.doorList = door;
//	}
//	


	
	
	
}
