package com.restoexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestClass {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		
		ses.beginTransaction();
		
		Restaurant res1 = new Restaurant("Good Luck Cafe","FC ROAD","BUN MASKA",6);
		
		
		ses.save(res1);
		
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		

	}

}
