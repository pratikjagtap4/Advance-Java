package lambdaexp;

interface Ex2Cars {
	public String details(String name , int price);
}


public class Ex02CarBrands {

	public static void main(String[] args) {
		
		Ex2Cars car1 =  (name , price) -> {return "Car name is " + name  + " and price is " + price;} ;
		System.out.println(car1.details("Thar", 1700000));
		
		Ex2Cars car2 = (name , price) -> "Car name is " + name  + " and price is " + price;
		String result = car2.details("Onmi" , 200000);
		System.out.println(result);
		
		Ex2Cars car3 = (name , price) ->{ 
			System.out.println("Hello");
			return ("Car name is " + name  + " and price is " + price);
			};
		System.out.println(car3.details("nano" , 100000));
	}	

}
