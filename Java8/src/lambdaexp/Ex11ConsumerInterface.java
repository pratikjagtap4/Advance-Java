package lambdaexp;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

class Student {
	
	public static  void displayName(String name)
	{
		System.out.printf("Your name is %s \n" , name);
	}
	
	public static void displayAge(Integer age)
	{
		System.out.println("Your age is " + age);
	}
	
	public static void displayInfo(String name ,Integer age)
	{
		System.out.println("Your name is " + name + " and your age "+ age);
	}
	
	public static void displayFoodItems(HashMap<String ,Integer> maps , String name) {
		System.out.println("\n below are the food items consumed by " + name);
		maps.forEach((key, val) -> System.out.println("Items " + key + " quantity " +val ));
	}
}


public class Ex11ConsumerInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		//Consumer Interface
		Consumer<String> c1 = Student ::displayName;
		c1.accept(name);
		
		Consumer<Integer> c2 = Student ::displayAge;
		c2.accept(age);
		
		//BiConsumer Interface
		BiConsumer<String,Integer> c3 = Student ::displayInfo;
		c3.accept(name , age);
		
		
		HashMap<String , Integer> foodMap = new HashMap<String , Integer>();
		foodMap.put("Maggie" , 6);
		foodMap.put("Biscuit" , 20);
		foodMap.put("Coke" , 5);
		foodMap.put("Chips", 10);
		foodMap.put("Nuttella", 1);
		foodMap.put("Bread", 3);
		
		BiConsumer<HashMap<String , Integer> , String> c4 = Student :: displayFoodItems;
		c4.accept(foodMap, name);
		
	}

}