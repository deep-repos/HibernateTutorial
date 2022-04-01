package Deep.HibernateTutorial;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person_Type {
	
	@Id
	private int roll;
	
	public CourceCertificate getCc() {
		return cc;
	}
	public void setCc(CourceCertificate cc) {
		this.cc = cc;
	}

	private String name;
	
	private String city;
	
	private CourceCertificate cc;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String  toString() {
		return this.roll+">>"+this.name+">>>"+this.city;
	}

}
