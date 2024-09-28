package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		
		ses.beginTransaction();
		
		Student s1 = new Student("Swapnil" , "IT " , "BE");
		
		
		ses.save(s1);
		
		ses.getTransaction().commit();
		ses.close();
		sf.close();		
	}

}
