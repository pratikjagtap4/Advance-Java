package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Ex11Callable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/car";
		String user = "root";
		String pass = "root@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url , user , pass);
		
		CallableStatement cstmt = con.prepareCall("{call  getCarCount(?,?)}");
		
		cstmt.setString(1, "Audi");
		cstmt.registerOutParameter(2,Types.INTEGER);
		cstmt.execute();
		
		int count = cstmt.getInt(2);
		
		System.out.println(" The is " + count + " Audi car");
	}

}
