 
package lambdaexp;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

class Restaurant {
	public static String famous( String name ){
		return "The best cuisine of " + name + " is Egg Sandwich" ; 
	}
	
	public static String famousBiryani( String name , Integer price ){
		return "The best cuisine of " + name + " is Biryani ad its price is " + price  ; 
	}
	
	public static boolean overPrice(Integer price) {
		if(price<500)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}


public class Ex12FunctionInterface {
	public static void main(String[] args) {
		
		// Function Interface
		String name = "GoodLuck";
		Function<String , String> f1 = Restaurant :: famous;
		String str = f1.apply(name);
		System.out.println(str);
		
		
		//BiFunction Interface
		
		String name2 = "Pk Biryani House";
		BiFunction<String , Integer , String> f2 = Restaurant::famousBiryani;
		String str2 = f2.apply(name2, 350);
		System.out.println(str2);
		
		//Predicate Interface
		
		Predicate<Integer> p1 = Restaurant :: overPrice;
		boolean b1= p1.test(70);
		System.out.println(b1);
		
		
	}
}
