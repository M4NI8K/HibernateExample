package info.michalak;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table (name="UserDetails")
public class UserDetails {
	
	
	@Id 
	private int userId;	
										//@Basic()-with configuration is used
	private String userName;			//@Transient or Static or Transint notation are not send to DB
	
	@Temporal(TemporalType.DATE) 		//@Temporal with TemporalType Provides DateFormat
	private Date joinedDate;
	
	@Lob								//Lob (LargeObject) more than 255in size  Auto Blob or clod byte or character 
	private Date descryption;			   
	
	
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	
}
