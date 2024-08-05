package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Car {
	int id ;
	String company;
	String carName;
	int price;
	
	public Car(int id, String company, String carName, int price) {
		this.id = id;
		this.company = company;
		this.carName = carName;
		this.price = price;
	}	
}

public class Ex02ObjectInsertion {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/car";
		String user = "root";
		String pass = "root@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url , user , pass);
		Statement stmt = con.createStatement();
		
		Car car1 = new Car(1001, "Tata", "Nexon" , 1800000);
		Car car2 = new Car(2002, "Mercedez", "Benz AQ" , 10800000);
		Car car3 = new Car(3003, "Audi", "A" , 1000000);
		Car car4 = new Car(4004, "Kia", "Sonet" , 250000);
		Car car5 = new Car(5005, "Hyundai", "Creta" , 2200000);

		
//		int result = stmt.executeUpdate("insert into carData values('"+car1.id+"' ,'"+car1.company+"'   ,'"+car1.carName+"'   ,'"+car1.price+"'  )" );
//		int result2 = stmt.executeUpdate("insert into carData values('"+car2.id+"' , '"+car2.company+"' , '"+car2.carName+"' , '"+car2.price+"' )");
//		int result3 = stmt.executeUpdate("insert into carData values('"+car3.id+"', '"+car3.company+"' , '"+car3.carName+"' , '"+car3.price+"' )");
//		int result4 = stmt.executeUpdate("insert into carData values('"+car4.id+"' , '"+car4.company+"' , '"+car4.carName+"' , '"+car4.price+"' )");
//		int result5 = stmt.executeUpdate("insert into carData values('"+car5.id+"', '"+car5.company+"' , '"+car5.carName+"' , '"+car5.price+"' )");
//		System.out.println( result2 + "" + result3 + ""+ " object inserted");
		
//		int result6 = stmt.executeUpdate("delete from carData where id = '"+car2.id+"'");
//		System.out.println(result6 + " record deleted");
		
		int result7 = stmt.executeUpdate("update carData set company = 'suzuki' , carName = 'Brezza' , price = 140000 where id = '"+car4.id+"'");
		System.out.println(result7 + " record updated");
	}
}
