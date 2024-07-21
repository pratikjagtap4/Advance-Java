package lambdaexp;

interface Ex3Cars {
	public void details(Ex3CarDetails car);
}


class Ex3CarDetails {
	 String company;
	 String name;
	 String color;
	 int price;
	 int seating;
	
	public Ex3CarDetails(String company, String name, String color, int price, int seating) {
		
		this.company = company;
		this.name = name;
		this.color = color;
		this.price = price;
		this.seating = seating;
	}	
}
 
 
public class Ex03CarData {
	 
	 public static void main(String[] args) {
		 Ex3CarDetails c1 = new Ex3CarDetails("Mahindra" , "Thar" , "Black" , 1700000 , 5);
		 
		 Ex3CarDetails c2 = new Ex3CarDetails("Hyundai" , "Creta" , "Black" , 1500000 , 5);
		 
		 Ex3CarDetails c3 = new Ex3CarDetails("Toyota" , "Fortuner" , "White" , 4700000 , 7);
		 
		 Ex3Cars car1 = (c) -> {
			 System.out.println(c.company + " " + c.name  + " " + c.color + " "  + c.price + " " + c.seating  );
		 };
		 car1.details(c1);
		 car1.details(c2);
	 }
 }
