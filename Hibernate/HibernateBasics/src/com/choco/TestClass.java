package com.choco;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestClass {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure("hibernate2.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		
		ses.beginTransaction();
		
		Chocolate c1 = new Chocolate("Dairy Milk Silk", "Kuch mitha ho jaye", 100); 
		Chocolate c2 = new Chocolate("5 Star" , "Eat 5 stardo nothing" , 20);
		Chocolate c3 = new Chocolate("Sneakers" , "Ise khao bhook mitao" , 35);
		
		
		ses.save(c1);
		ses.save(c2);
		ses.save(c3);
		
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		
		

	}

}
