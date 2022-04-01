package OneToMany_and_ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/*
 * One question can have multiple awnsers
 * So
 * Question q1 has Awnsers a1,a2,a3
 * It means a1 has q1
 * a2 has q1
 * a3 has q1
 *Many awnser is mmaped to one question
 *so many to one mapping
 *
 * */

@Entity
public class Awnser {
	@Id
	private int awns_id;
	
	
	private String awnser_col;
	
	
	@ManyToOne
	@JoinColumn(name="qid_awns_id")
	private Question question_obj_in_awnser;


	public int getAwns_id() {
		return awns_id;
	}


	public void setAwns_id(int awns_id) {
		this.awns_id = awns_id;
	}


	public String getAwnser_col() {
		return awnser_col;
	}


	public void setAwnser_col(String awnser_col) {
		this.awnser_col = awnser_col;
	}


	public Question getQuestion_obj_in_awnser() {
		return question_obj_in_awnser;
	}


	public void setQuestion_obj_in_awnser(Question question_obj_in_awnser) {
		this.question_obj_in_awnser = question_obj_in_awnser;
	}
	
	
	
	
}
