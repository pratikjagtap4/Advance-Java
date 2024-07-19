package lambdaexp;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex15StreamApiTerminal {

	public static void main(String[] args) {
		
ArrayList<Integer> numbers = new ArrayList<Integer>();
 		
		numbers.add(18);
		numbers.add(44);
		numbers.add(7);
		numbers.add(25);
		numbers.add(21);	
		numbers.add(45);
		numbers.add(40);
		numbers.add(84);
		numbers.add(69);
		numbers.add(99);
 		
 		
 		
 		// terminal operations
 		int sum = numbers.stream().reduce(8, (add,n)->add+n);
 		System.out.println(sum);
 		
 		int sum2 = numbers.stream().reduce(8, Integer::sum);
 		System.out.println(sum2);
 		
 		int sum3 = numbers.stream().collect(Collectors.summingInt(x->x));
 		System.out.println(sum3);
 		
 		//average
 		double avg1 = numbers.stream().collect(Collectors.averagingDouble(x->x));
 		System.out.println(avg1);
 		
 		
 		//factorial
 		
		ArrayList<Integer> nums = new ArrayList();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
	
		
		int factorial = nums.stream().reduce(1, (fac , n) ->fac*n);
		System.out.println(factorial);
		
		
		//count
		
		long count = numbers.stream().filter(x->x%2!=0).count();
		System.out.println(count);
		
		
		int maxNum = numbers.stream().max((n1 , n2)->n1>n2? 1 : -1).get();
		System.out.println(maxNum);
		
		int minNum = numbers.stream().min((n1 , n2)->n1>n2? 1 : -1).get();
		System.out.println(minNum);
		
	}

}