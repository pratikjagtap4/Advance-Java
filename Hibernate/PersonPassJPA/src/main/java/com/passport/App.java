package com.passport;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pass_JPA");
       EntityManager em = emf.createEntityManager();
       
       em.getTransaction().begin();
       
       Passport pass3 = new Passport();
       pass3.setP_identification("ABCDE1234F");
       
       Passport pass4 = new Passport();
       pass4.setP_identification("QWERTY456");
       
       DrivingLic dl1 = new DrivingLic();
       dl1.setLicenceNumber("abcd123");
       dl1.setState("Maharashtra");
       
       
       DrivingLic dl2 = new DrivingLic();
       dl2.setLicenceNumber("qwer789");
       dl2.setState("Karnataka");
       
       
       Person p1 = new Person("Swapnil Dahiphale", "Pune" , pass4 , dl1);
       Person p2 = new Person("Lucky Kore" , "Solapur" , pass3, dl2);
       
       em.persist(p1);
       em.persist(p2);
       
       em.getTransaction().commit();
       em.close();
       emf.close();
       
       
       
    }
}
