package treemap;

import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		TreeMap tm1 = new TreeMap();
		tm1.put(12 , "x");
		tm1.put(8, "z");
//		tm1.put(null, "p"); null pointer exception
		
		System.out.println(tm1);

	}

}
