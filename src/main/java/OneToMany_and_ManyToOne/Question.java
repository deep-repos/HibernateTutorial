package OneToMany_and_ManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/*
 * One question can have multiple awnsers
 * So
 * Question q1 has Awnsers a1,a2,a3
 *
 * */
@Entity
public class Question {

		@Id
		private int q_id;
		
		private String quesion_col;
		
		
		@OneToMany(mappedBy = "question_obj_in_awnser")
		private List<Awnser>multiple_awnsers_list;


		public int getQ_id() {
			return q_id;
		}


		public void setQ_id(int q_id) {
			this.q_id = q_id;
		}


		public String getQuesion_col() {
			return quesion_col;
		}


		public void setQuesion_col(String quesion_col) {
			this.quesion_col = quesion_col;
		}


		public List<Awnser> getMultiple_awnsers_list() {
			return multiple_awnsers_list;
		}


		public void setMultiple_awnsers_list(List<Awnser> multiple_awnsers_list) {
			this.multiple_awnsers_list = multiple_awnsers_list;
		}
		
		
		
		
		
		
}
