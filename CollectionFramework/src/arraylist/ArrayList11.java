package arraylist;

import java.util.ArrayList;

public class ArrayList11 {

	public static void main(String[] args) {
		
		//normal collection
		ArrayList al1 = new ArrayList();
		
		al1.add(new Employee(101 , "Pratik"));
		al1.add(new Employee(201 , "Swapnil"));
		
		//approach 1 : for each
		for(Object o : al1)
		{
			Employee ee = (Employee)o;
			System.out.println(ee.empId + " - " + ee.empName); 
		}
		
		// approach 2 : get method
			
		Object o1 = al1.get(0);
		Employee ee1 = (Employee)o1;
		System.out.println(ee1.empId + " - " + ee1.empName);
		
		Object o2 =al1.get(1);
		Employee ee2 = (Employee)o2;
		System.out.println(ee2.empId + " - " + ee2.empName);
		
		// generic collection
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(new Employee(303 , "Lucky"));
		
		// for each
		for(Employee ee : al2)
		{
			System.out.println(ee.empId + " - " + ee.empName);
		}
		
		// get method
		Employee eee1 = al2.get(0);
		System.out.println(eee1.empId + " - " + eee1.empName);
	}

}
