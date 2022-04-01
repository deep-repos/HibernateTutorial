package OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	int qid;
	
	String question_col;

	@OneToOne
	@JoinColumn(name="qid_awns_id")
	private Awnser awns;
	
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion_col() {
		return question_col;
	}

	public void setQuestion_col(String question_col) {
		this.question_col = question_col;
	}

	public Awnser getAwns() {
		return awns;
	}

	public void setAwns(Awnser awns) {
		this.awns = awns;
	}
	
	
	
}
