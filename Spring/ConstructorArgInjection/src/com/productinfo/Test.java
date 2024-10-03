package com.productinfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		
		Product p1 = (Product) context.getBean("product1");
		
		System.out.println(p1.toString());
		
		Product p2 = (Product) context.getBean("product2");
		
		System.out.println(p2.toString());
	}

}
