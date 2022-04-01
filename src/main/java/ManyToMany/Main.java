package ManyToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	
	public static void main(String args[]) {
		
		Employee e1 =new Employee();
		e1.setE_id(22);
		e1.setEmployee_name("Mr Misra");
	
	
		Employee e2 =new Employee();
		e2.setE_id(34);
		e2.setEmployee_name("Mr Dubey");
	
		
		Project p1= new Project();
		p1.setProject_id(400);
		p1.setProject_name("Scalable Systems");
		
		
		Project p2= new Project();
		p2.setProject_id(405);
		p2.setProject_name("ETL systems");
		
		
		//now e1 can work in p1 ans p2
		ArrayList<Project> list_of_projects = new ArrayList<Project>();
		list_of_projects.add(p1);
		list_of_projects.add(p2);
		
		e1.setList_of_project(list_of_projects);

		//now e2 can work in p1 and p2
		e2.setList_of_project(list_of_projects);
		
		//now p1 can have e1 and e2
		ArrayList<Employee> list_of_employee = new ArrayList<Employee>();
		list_of_employee.add(e1);
		list_of_employee.add(e2);
		
		p1.setList_of_employee(list_of_employee);
		
		//now p2 can have e1 and e2
		p2.setList_of_employee(list_of_employee);
		

		
		
		
		Configuration cfg = new Configuration();
	     cfg.configure("xmlFile.xml");
	     SessionFactory factory =  cfg.buildSessionFactory();		     
		 Session session = factory.openSession();
		 
		 Transaction tx = session.beginTransaction();
	     System.out.println("storing in db...");
	      session.save(e1);
	      session.save(e2);
	      session.save(p1);
	      session.save(p2);
	      
	      tx.commit();
	      session.close();
		
		
		
	}
	
}
