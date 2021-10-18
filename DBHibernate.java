package net.javaguides.hibernate.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class DBHibernate {
	
public static void main(String[] args) { // use to test connectivity   
        
	    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	  
	    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	    Session session = factory.openSession();  
	    Transaction t = session.beginTransaction();   
	      // use to test connectivity      
	    Employee e1=new Employee();    
	    e1.setId(2343);    
	    e1.setName("joel powell");    
	    e1.setPassword("hyf65");    
	    session.save(e1);  
	    
	    t.commit();  
	    System.out.println("successfully saved");    
	    factory.close();  
	    session.close();    
	        
	}    

}
