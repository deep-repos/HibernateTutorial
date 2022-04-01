package OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

		public static void main(String args[]) {
			 Configuration cfg = new Configuration();
		     cfg.configure("xmlFile.xml");
		     SessionFactory factory =  cfg.buildSessionFactory();		     
			 Session session = factory.openSession();
			  
			 Question q =new Question();
			 q.setQid(12);
			 q.setQuestion_col("What is Java");
			  
			 Awnser awns =new Awnser();
			 awns.setAwns_id(45);
			 awns.setAwns_col("Java is prograaming language");
			 
			 q.setAwns(awns);
			 
			 
			 Question q1 =new Question();
			 q1.setQid(13);
			 q1.setQuestion_col("What is C");
			  
			 Awnser awns1 =new Awnser();
			 awns1.setAwns_id(46);
			 awns1.setAwns_col("C is prograaming language");
			 
			 q1.setAwns(awns1);
			 
			 
			 
			 
			 
			  
			  
		      Transaction tx = session.beginTransaction();
		      System.out.println("storing in db...");
		      session.save(q);
		      session.save(awns);
		      session.save(q1);
		      session.save(awns1);
		      
		      tx.commit();
		      session.close();
		      
		}
		
}
