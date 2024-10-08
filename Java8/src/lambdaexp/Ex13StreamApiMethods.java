package lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex13StreamApiMethods {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("pratik");
		names.add("Swapnil");
		names.add("Sidharth");
		names.add("Lucky");
		
		List<String> sNames = names.stream().filter((n)->n.startsWith("S")).sorted().map(n->n + " Hello").collect(Collectors.toList());
		
		System.out.println(sNames);
		ArrayList sortedS = new ArrayList(sNames);
		
 		System.out.println(sortedS);
 		
 		
 		ArrayList<Integer> nums = new ArrayList<Integer>();
 		
 		nums.add(18);
 		nums.add(44);
 		nums.add(7);
 		nums.add(25);
 		nums.add(21);
 		nums.add(45);
 		nums.add(40);
 		nums.add(84);
 		nums.add(69);
 		nums.add(99);
 		
 		Set<Integer> oddNums = nums.stream().filter(n->n%2==0).sorted().map(n->n*n).collect(Collectors.toSet());
 		
 		System.out.println(oddNums);
 		
 		// terminal operations
 		int sum = nums.stream().reduce(8, (add,n)->add+n);
 		System.out.println(sum);
 		
 		int sum2 = nums.stream().reduce(8, Integer::sum);
 		System.out.println(sum2);
	}

}
