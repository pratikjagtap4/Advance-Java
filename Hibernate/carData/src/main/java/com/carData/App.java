package com.carData;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarData_JPA");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        CarData c1 = new CarData("Harrier" , "Base-model" , 2500000);
        CarData c2 = new CarData("Punch" , "Top-Model" , 1200000);
        CarData c3 = new CarData("Nano" , "TopModel" , 200000);
        CarData c4 = new CarData("Nexon" , "top Model " , 1600000);
        
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(c4);
        
        em.getTransaction().commit();
        
        Query query = em.createQuery("select c from CarData c where c.price > 1500000");
        List<CarData> cars = query.getResultList();
        
        for(CarData c : cars) {
        	System.out.println(c.getName());
        }
        
        
    }
}
