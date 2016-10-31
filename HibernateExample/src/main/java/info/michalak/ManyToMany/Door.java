package info.michalak.ManyToMany;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import info.michalak.mapping.Vechicle;

@Entity
public class Door {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int doorId;
	
	private String color;
	
	@OneToMany
	private ArrayList<KeyCard> keyList = new ArrayList<KeyCard>();
	
	
	
	
	
	
	
	public int getDoorId() {
		return doorId;
	}

	public String getColor() {
		return color;
	}

	public ArrayList<KeyCard> getKeyList() {
		return keyList;
	}

	public void setDoorId(int doorId) {
		this.doorId = doorId;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setKeyList(ArrayList<KeyCard> vechicleList) {
		this.keyList = vechicleList;
	}
}
