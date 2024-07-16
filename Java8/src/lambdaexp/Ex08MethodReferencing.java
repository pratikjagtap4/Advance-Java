package lambdaexp;

interface Description {
	void display(String name, int age );
}

class CyberSuccess {
	
	CyberSuccess(){
		
	}
	
	CyberSuccess(String name , int age){
		System.out.println(name + " - " + age );
	}
		
	
	static void java(String name , int age ) {
		System.out.println(name + " - " + age);
	}
	
	void python(String name , int age) {
		System.out.println(name + " - " + age);
	}
}


public class Ex08MethodReferencing implements Description{

	public static void main(String[] args) {
		
		// calling static method
		// approach 1
		String name ="Pratik";
		int age = 23;
		
		Ex08MethodReferencing obj = new Ex08MethodReferencing();
		obj.display(name,age);
		
		
		
		//approach 2
		String name2 = "Swapnil";
		int age2 = 24;
		
		Description d2 = (n , a)-> CyberSuccess.java(n , a);
		d2.display(name2, age2);
		
		
		// approach 3 
		String name3 = "Lucky";
		int age3 = 25;
		
		Description d3 = (n , a)-> CyberSuccess.java(n , a);
		d2.display(name3, age3);
		
		
		
		// calling instance method
		
		CyberSuccess obj1 = new CyberSuccess();
		
		String  name4 = "Dhananjay";
		int age4 = 24;
		
		Description d4 = obj1::python;
		d4.display(name4, age3);
		
		
		// calling constructor 
		
		String name5 = "Tushar";
		int age5 = 23;
		
		Description d5 = CyberSuccess :: new;
		d5.display(name5, age4);
		
		
	}

	public  void display(String name, int age) {
		CyberSuccess.java(name, age);
		
	}
}
