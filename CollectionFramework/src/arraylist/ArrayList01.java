package arraylist;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add('x');
		al.add(200.5);
		al.add("pratik");
		System.out.println(al);
		al.add(100);
		al.add('x');
		System.out.println(al);
		al.add(null);
		al.add(null);
		System.out.println(al);
	}

}
