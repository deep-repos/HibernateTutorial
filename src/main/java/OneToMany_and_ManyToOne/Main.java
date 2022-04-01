package OneToMany_and_ManyToOne;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	/**
	 * One question has many awnsers
	 * q1 will have a1,a2,a3
	 * 
	 * One awnser will have one quesion
	 * many awnser will have one question
	 * a1 has q1
	 * a2 has q1
	 * a3 has q1
	 * 
	 * */
	
	public static void main(String args[]) {
	
		Question q1 =new Question();
		q1.setQ_id(12);
		q1.setQuesion_col("What is Java ");
		
		Awnser a1 =new Awnser();
		a1.setAwns_id(44);
		a1.setAwnser_col("Java is language");
		
		Awnser a2 =new Awnser();
		a2.setAwns_id(45);
		a2.setAwnser_col("Java is Programming language");
		
		Awnser a3 =new Awnser();
		a3.setAwns_id(46);
		a3.setAwnser_col("Java is High level Programming language");
		
		
		//now q1 has a1,a2,a3;
		ArrayList<Awnser> list = new ArrayList<Awnser>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		q1.setMultiple_awnsers_list(list);
		
		/*a1 has q1
		*a2 has q1
		*a3 has q1
		*/
		
		a1.setQuestion_obj_in_awnser(q1);
		a2.setQuestion_obj_in_awnser(q1);
		a3.setQuestion_obj_in_awnser(q1);
		
		
		
		
		 Configuration cfg = new Configuration();
	     cfg.configure("xmlFile.xml");
	     SessionFactory factory =  cfg.buildSessionFactory();		     
		 Session session = factory.openSession();
		 
		 Transaction tx = session.beginTransaction();
	     System.out.println("storing in db...");
	      session.save(q1);
	      session.save(a1);
	      session.save(a2);
	      session.save(a3);
	      
	      tx.commit();
	      session.close();
	      
		
	}
	
	
	
	
	
}
