package info.michalak.mapping;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import info.michalak.ManyToMany.KeyCard;
 

//	ONE TO MANY *
//	BI DIRECTIONAL*


@Entity
public class Vechicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int vechicalId;
	private String vechicalName;
	

//MANY TO ONE**
	@ManyToOne 
	Driver driver = new Driver();
	
	
	
	//Getters and Setters
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}	
	
	
//END	**

	

	
//END	***


	
	public int getVechicalId() {
		return vechicalId;
	}
	public String getVechicalName() {
		return vechicalName;
	}
	public void setVechicalId(int vechicalId) {
		this.vechicalId = vechicalId;
	}
	public void setVechicalName(String vechicalName) {
		this.vechicalName = vechicalName;
	}
	
	
}
