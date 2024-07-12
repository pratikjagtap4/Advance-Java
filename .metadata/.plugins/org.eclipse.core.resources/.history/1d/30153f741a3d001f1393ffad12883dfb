package arraylist;

import java.util.ArrayList;

public class ArrayList04 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101 , "Pratik");
		Student s2 = new Student(202 , "Swapnil");
		Employee e3 = new Employee(303 , "Lucky");
		Integer i = 100;
		
		ArrayList al = new ArrayList();
		
		al.add(e1);
		al.add(s2);
		al.add(e3);
		al.add(i);
		
		for(Object o : al)
		{
			if(o instanceof Employee)
			{
				Employee e = (Employee)o;
				System.out.println(e.empId + "-" + e.empName);
			}
			
			else if(o instanceof Student)
			{
				Student s = (Student)o;
				System.out.println(s.studId + "-" + s.studName);
			}
			else if(o instanceof Integer)
			{
				Integer ii = (Integer)o;
				System.out.println(ii);
			}
		}
	}

}
