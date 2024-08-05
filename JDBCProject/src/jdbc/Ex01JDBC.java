package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ict" , "root" ,"root@123");
		
		Statement stmt = con.createStatement();
		
		int result = stmt.executeUpdate("insert into players values('Rohit Sharma' , 45 , 'Batsman' , 37) , ('MS Dhoni' , 7 , 'WicketKeeper Batsman' , 42) , ('Jasprit Bumrah' , 93 , 'Fast Bowler' ,29)");
		System.out.println(result + "record inserted");
	}

}