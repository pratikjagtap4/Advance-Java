package com.employeeInfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDetails emp  = (EmployeeDetails) context.getBean("employee1");
		EmployeeDetails emp2 = (EmployeeDetails) context.getBean("employee2");
		EmployeeDetails emp3 = (EmployeeDetails) context.getBean("employee3");
		
		System.out.println(emp.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
	}

}
