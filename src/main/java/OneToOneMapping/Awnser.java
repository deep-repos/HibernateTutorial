package OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Awnser {
	@Id
	int awns_id;
	
	private String awns_col;
	
	
	public int getAwns_id() {
		return awns_id;
	}

	public void setAwns_id(int awns_id) {
		this.awns_id = awns_id;
	}

	public String getAwns_col() {
		return awns_col;
	}

	public void setAwns_col(String awns_col) {
		this.awns_col = awns_col;
	}


	
}
