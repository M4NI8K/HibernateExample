package info.michalak;

import javax.persistence.Column;
import javax.persistence.Embeddable;

          			// @Embeddable means it has to be included in table no matter wher used it will be included

@Embeddable
public class Address {

@Column	(name= "Street")
private String street;
@Column	(name= "City")
private String city;
@Column	(name= "Postcode")
private String postcode;


public String getStreet() {
	return street;
}
public String getCity() {
	return city;
}
public String getPostcode() {
	return postcode;
}
public void setStreet(String street) {
	this.street = street;
}
public void setCity(String city) {
	this.city = city;
}
public void setPostcode(String postcode) {
	this.postcode = postcode;
}

	
}
