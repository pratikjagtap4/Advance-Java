package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex07checkedException {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url  = "jdbc:mysql://localhost:3306/contryInfo";
		String user = "root";
		String pass = "root@123";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con = DriverManager.getConnection(url , user  , pass);
		
		Statement smt = con.createStatement();
		
		int r1 = smt.executeUpdate("insert into countries values('India' , 'Delhi' , 91)");
		System.out.println(r1 + " data inserted");

		int r2 = smt.executeUpdate("insert into countries values('Usa' , 'WDC' , 01)");
		System.out.println(r2 + " data inserted");

		int r3 = smt.executeUpdate("insert into countri values('Australia' , 'Canberra' , 46)");
		// java.sql.SQLSyntaxErrorException:  is checked exception that compiler throws when sql query is wrong this means the code will not get compile, but the the JDBCDriver here will execute the the correct queies no matter code runs or not  
		System.out.println(r3 + " data inserted");
		
	}

}
