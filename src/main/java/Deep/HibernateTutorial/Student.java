package Deep.HibernateTutorial;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.xml.bind.v2.runtime.RuntimeUtil.ToStringAdapter;


@Entity
public class Student {
	@Id
	private int roll;
	
	private String name;
	
	private String city;
	
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
