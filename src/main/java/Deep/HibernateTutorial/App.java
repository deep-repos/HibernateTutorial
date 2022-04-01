package Deep.HibernateTutorial;


import java.security.Certificate;
import java.util.HashMap;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("xmlFile.xml");
        SessionFactory factory =  cfg.buildSessionFactory();
        System.out.println(factory);
        
        Student student =new Student();
        student.setRoll(113);
        student.setName("Munna Dalal");
        student.setCity("Chennai");
        System.out.println(student.toString());
      
        /*Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        tx.commit();
        
        session.close();
        */
        
     /*   Person p =new Person();
        p.setBoolVar(true);
        p.setBytes("abc".getBytes());
        p.setByteVar((byte)20);
        p.setCharVar('y');
        p.setDoubleVar(3.142);
        p.setFloatVar(0.1f);
        p.setId(99);
        p.setIntVar(-34);
        p.setLongVar(88788888);
        p.setShortVar((short)67);
        p.setStrVar("!@#$%^&*()P");
        HashSet<Integer> hs =  new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        p.setHs(hs);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        System.out.println("storing in db...");
        session.save(p);
        tx.commit();
        HashMap<String,Object> hm = (HashMap<String, Object>) factory.getProperties();
        for(String s : hm.keySet()) {
        	System.out.println(">>>>>>");
        	System.out.println(s);
        	System.out.println(hm.get(s));
        
        	
        }
        
        
        session.close();
        
        */
        
        /*Customer customer =  new Customer ();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        System.out.println("storing in db...");
        session.save(customer);
        tx.commit();
        session.close();
        */
        
    /*    Session session = factory.openSession();
        Student s1 = (Student)session.load(Student.class, 1134);        
        
        Student s2 = (Student)session.load(Student.class, 1134);
        	try {
        	System.out.println(s1);
        	}finally {
        		System.out.println("err1");
        		try{
        			System.out.println(s2);
        		
        		}finally {
        			System.out.println("err2");
        		}
        	}
        
        
      */
        
        
        Person_Type p_t =new Person_Type();
        p_t.setCity("Mumbai");
        p_t.setName("Deep");
        p_t.setRoll(123);
        CourceCertificate cc =new CourceCertificate();
        cc.setCourse_id(121);
        cc.setCourse_name("Java");
        p_t.setCc(cc);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        System.out.println("storing in db...");
        session.save(p_t);
        tx.commit();
        session.close();
        
    }
}
