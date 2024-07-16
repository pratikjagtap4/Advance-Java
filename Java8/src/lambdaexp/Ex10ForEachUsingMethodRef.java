package lambdaexp;

import java.util.ArrayList;

public class Ex10ForEachUsingMethodRef {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList();
		cities.add("Mumbai");
		
		cities.forEach(System.out::println);
	}

}
