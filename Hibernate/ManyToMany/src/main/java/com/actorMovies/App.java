package com.actorMovies;

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
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("actorMovies_JPA");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	
        Actors a1 = new Actors("pratik" , 23);
        Actors a2 = new Actors("Swapnil" , 24);
        Actors a3 = new Actors("Lucky" , 24);
        Actors a4 = new Actors("Tushar" , 23);
        Actors a5 = new Actors("Dhanajay" , 23);
        
        Actors a6 = new Actors("Yash" , 24);
        Actors a7 = new Actors("Sagnik" , 23);
        Actors a8 = new Actors("Sagar" , 29);
        Actors a9 = new Actors("Raj" , 25);
        Actors a10 = new Actors("Shubham" , 24);
        Actors a11 = new Actors("Aashay" , 24);
        Actors a12 = new Actors("Rohan" , 24);
        Actors a13 = new Actors("Shreya" , 24);
        Actors a14 = new Actors("Nikita" , 24);
        Actors a15 = new Actors("Tanvi" , 24);
        
        
        
        Movies m1 = new Movies("jindagi na milegi dobara" , 10 , 2012);
        Movies m2 = new Movies("Yeh Jawani hai diwani" , 9.5 , 2013);
        Movies m3 = new Movies("little things" , 9 , 2018);
        Movies m4 = new Movies("Sita ramam" , 10 , 2022);
        Movies m5 = new Movies("3 idiots" , 10 , 2009);
        Movies m6 = new Movies("KGF" , 9 , 2018);
        Movies m7 = new Movies("shala" , 10 , 2012);
        Movies m8 = new Movies("mirzapur" , 9 , 2019);
        
        m1.getActors().add(a1);
        m1.getActors().add(a4);
        m1.getActors().add(a5);
        m1.getActors().add(a2);
        
        m2.getActors().add(a2);
        m2.getActors().add(a3);
        m2.getActors().add(a10);
        m2.getActors().add(a1);
        
        m3.getActors().add(a13);
        m3.getActors().add(a14);
        m3.getActors().add(a15);
        m3.getActors().add(a12);
        
        m4.getActors().add(a6);
        m4.getActors().add(a7);
        m4.getActors().add(a8);
        m4.getActors().add(a9);
        
        m5.getActors().add(a9);
        m5.getActors().add(a11);
        m5.getActors().add(a12);
        m5.getActors().add(a4);
        
        m6.getActors().add(a1);
        m6.getActors().add(a2);
        m6.getActors().add(a13);
        m6.getActors().add(a5);
        
        
        m7.getActors().add(a4);
        m7.getActors().add(a3);
        m7.getActors().add(a14);
        m7.getActors().add(a7);
        
        m8.getActors().add(a5);
        m8.getActors().add(a10);
        m8.getActors().add(a15);
        
        
        em.persist(m1);
        em.persist(m2);
        em.persist(m3);
        em.persist(m4);
        em.persist(m5);
        em.persist(m6);
        em.persist(m7);
        em.persist(m8);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
       
    }
}
