package com.coldDrink;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cold_JPA");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
//    	
//    	ColdDrink cd1 = new ColdDrink("REdBull" , "It gives you wiiiiiing" , 140);
//    	ColdDrink cd2 = new ColdDrink("Moutain Dew" , "Darrr ki maa ki aankh" , 40);
//    	ColdDrink cd3 = new ColdDrink("Nimbuzz" , "Ek ghhut me chatak jaa" , 35);
//    	ColdDrink cd4 = new ColdDrink("Sprite" , "Beat the Heat" , 40);
//    	ColdDrink cd5 = new ColdDrink("Slice" , "Harr ghhut me aam" , 40);
//    	
//    	
//    	em.persist(cd1);
//    	em.persist(cd2);
//    	em.persist(cd3);
//    	em.persist(cd4);
//    	em.persist(cd5);
    	
    	
    	ColdDrink cd = em.find(ColdDrink.class, 3);
    	cd.setTagline("har ghhut me taza nimbu");
    	
    	
    	em.getTransaction().commit();
    	
    	em.close();
    	emf.close();
    }
}
