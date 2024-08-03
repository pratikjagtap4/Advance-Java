
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList22 {

	public static void main(String[] args) {
		ArrayList<Emp> al =new ArrayList();
		
		al.add(new Emp(404 , "Pratik"));
		al.add(new Emp(303 , "Swapnil"));
		al.add(new Emp(202 , "Dhananjay"));
		al.add(new Emp(101 , "Tushar"));
		
		Collections.sort(al);
		
		Iterator it1 = al.iterator();
		while(it1.hasNext())
		{
			Object o = it1.next();
			Emp e = (Emp)o;
			System.out.println(e.empId + " - " + e.empName);
			
		}

	}

}
