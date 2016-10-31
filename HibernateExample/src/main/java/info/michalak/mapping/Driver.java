package info.michalak.mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


//ONE TO ONE
//ONE TO MANY additional table
//ONE TO MANY (MAPPED BY) 


@Entity
public class Driver {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int driverId;
	
	@Column(name="DRIVER_NAME")
	private String driverName;
	
	
	
	
	
//ONE TO ONE
	
	@OneToOne								//This creates;   ID column ;   in driver table;   with userNick ID 
	//@JoinColumn(name = "USER_NICK_VALUE")
	private UserNick userNick;
	
	
	//Getters and Setters
	public UserNick getUserNick() {
		return userNick;
	}	
	public void setUserNick(UserNick userNick) {
		this.userNick = userNick;
	}
	
//END	


	
	
//ONE TO MANY
	
//WAY1	additional table	
//This creates; new Table combining Driver ID(key) and Vechicle ID(Key)
	// check many to one in driver class	for MANY TO ONE  // BOTH GIVE ; BiDirectional Relationship
	
	
//	@JoinTable(name = "DRIVER_VECHICLE",								//@JoinTable notation + Table name artribute change
//			joinColumns=@JoinColumn(name = "DRIVER_ID"),				// joinColumns=@JoinColumn primary column name change 
//			inverseJoinColumns=@JoinColumn(name="VECHICLE_ID"))			//inverseJoinColumns=@JoinColumn secondary column name change
	
	// RESULT OF JOIN_TABLE //Hibernate: insert into Driver_Vechicle (Driver_driverId, vechicleList_vechicalId) values (?, ?)	
	

	
	
//WAY2 (MAPPED BY)	
	@OneToMany(mappedBy="driver")  // this makes other relation many to one in Vechicle "BiDirectional" to assign join column 
//	instead creating additional table it stores mapping in vechicle table
	private List<Vechicle> vechicleList = new ArrayList<Vechicle>();
	
	//Getters and Setters
	public List<Vechicle> getVechicleList() {
		return vechicleList;
	}
	public void setVechicleList(List<Vechicle> vechicleList) {
		this.vechicleList = vechicleList;
	}

	
//end
	
	
	
//BIDIRECTIONAL METHOD  commonly used
/*	
	public void addBiDirectional (Driver driv, Vechicle vech){
		
		driv.getVechicleList().add(vech); // can use this with one parameter
		vech.setDriver(driv); 
	}	
*/
		
		
	
	
	
	
	
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}	
	public int getDriverId() {
		return driverId;
	}
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}




	
}
