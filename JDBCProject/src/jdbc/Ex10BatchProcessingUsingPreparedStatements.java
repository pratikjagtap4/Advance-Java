package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex10BatchProcessingUsingPreparedStatements {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url  = "jdbc:mysql://localhost:3306/olympic";
		String user = "root";
		String pass = "root@123";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con = DriverManager.getConnection(url , user  , pass);
		
		con.setAutoCommit(false);
		
		PreparedStatement pst = con.prepareStatement("insert into olympicGames values (?,?,?,?)");
		
		pst.setInt(1, 1);
		pst.setString(2,"Badminton Mens");
		pst.setString(3, "Laksya Sen");
		pst.setInt(4, 4);
		
		pst.addBatch();
		
		pst.setInt(1, 2);
		pst.setString(2,"Badminton Womens");
		pst.setString(3, "P V Sindhu");
		pst.setInt(4, 9);
		
		pst.addBatch();
		
		pst.setInt(1, 3);
		pst.setString(2,"Pistol Shooting");
		pst.setString(3, "Manu Bhaker");
		pst.setInt(4, 3);
		
		pst.addBatch();
		
		pst.setInt(1, 4);
		pst.setString(2,"Riffle shooting");
		pst.setString(3, "Swapnil kusale");
		pst.setInt(4, 3);
		
		pst.addBatch();
		
		pst.setInt(1, 5);
		pst.setString(2,"Neeraj Chpra");
		pst.setString(3, "Javelin Throw");
		pst.setInt(4, 4);
		
		pst.addBatch();
		
		int count[] = pst.executeBatch();
		con.commit();
		
		System.out.println(count.length + " recodrs inserted");
		
	}

}
