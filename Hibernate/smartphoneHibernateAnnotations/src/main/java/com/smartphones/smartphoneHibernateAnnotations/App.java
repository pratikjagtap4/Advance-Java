package com.smartphones.smartphoneHibernateAnnotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration config = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session ses = sf.openSession();
        
        ses.beginTransaction();
        
        Phones p1 = new Phones("Samsung A30" , 15000);
        
        ses.save(p1);
        
        ses.getTransaction().commit();
        ses.close();
        sf.close();
        
    }
}
