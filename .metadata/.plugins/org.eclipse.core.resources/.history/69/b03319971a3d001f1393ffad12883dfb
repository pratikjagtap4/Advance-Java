package arraylist;

import java.util.ArrayList;

public class ArrayList09 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		
		al1.add(50);
		al1.add(100);
		al1.add(150);
		al1.add(200);
		al1.add(250);
		
		ArrayList al2 = new ArrayList();
		al2.addAll(al1);
		al2.add(300);
		al2.add(400);
		
		System.out.println(al2);
		System.out.println(al2.containsAll(al1));
		System.out.println(al2.isEmpty());
		Integer ii = 200;
		al2.remove(ii);
		
		System.out.println(al1 );
		System.out.println(al2);
		System.out.println(al2.containsAll(al1));
		al2.retainAll(al1);
		System.out.println(al2);
	}

}
