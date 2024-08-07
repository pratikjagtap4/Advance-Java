package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex09BatchProcessing {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url  = "jdbc:mysql://localhost:3306/olympic";
		String user = "root";
		String pass = "root@123";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con = DriverManager.getConnection(url , user  , pass);
		
		con.setAutoCommit(false);
		
		Statement stmt = con.createStatement();
		
		stmt.addBatch("insert into olympicGames values(1 , 'Badminton mens' , 'Lakshya Sen' , 4)");
		stmt.addBatch("insert into olympicGames values(2 , 'Badminton Womens' , 'P V Sindhu' , 9)");
		stmt.addBatch("insert into olympicGames values(3 , 'Pistol Womens' , 'Manu Bhaker' , 3)");
		stmt.addBatch("insert into olympicGames values(4 , 'Swapnil Kusale' , 'Riffle Shooting' , 3)");
		stmt.addBatch("insert into olympicGames values(5 , 'Javelin Throw Mens' , 'Neeraj Chopra' , 1)");
		
		int count[] = stmt.executeBatch();
		
		System.out.println(count.length + " records inserted");
		
		con.commit();
		con.close();
		stmt.close();
	}

}
