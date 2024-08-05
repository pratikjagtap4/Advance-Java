package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String url = "jdbc:mysql://localhost:3306/products";
		String userName = "root";
		String password = "root@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement stmt = con.createStatement();
		
//		int result = stmt.executeUpdate("insert into productInfo values(101 , 'Tata Salt' , 15 , 'grocery'), (202 , 'Nirma' , 10 , 'grocery') , (303 , 'Parle-G' , 10 , 'Snacks') ,(404 , 'Bisleri' , 20 , 'water' ) , (505 , 'Thumbs Up' , 40 , 'Soft Drink')");
//		int result = stmt.executeUpdate("update  productInfo set name = 'Tide' where id = 202");
		
//		int result = stmt.executeUpdate("update productInfo set name='Rin' where id = 202");
		
//		int result = stmt.executeUpdate("delete from productInfo where id=505");
		
//		System.out.println(result + " item deleted");
		
		ResultSet rs = stmt.executeQuery("select * from productInfo");
		
//		System.out.println(rs);
		
		while(rs.next())
		{
			System.out.println("The Product details are");
			System.out.println("Product Id : " + rs.getInt(1));
			System.out.println("Product Name : " + rs.getString(2));
			System.out.println("Product Price : " + rs.getInt(3));
			System.out.println("Product category: " + rs.getString(4));
			System.out.println();
			System.out.println();
		}
		
	}

}
