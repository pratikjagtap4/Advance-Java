package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Company
{
	int comId;
	String name;
	String loc;
	String domain;
	int turnover;
	
	
	public Company(int comId, String name, String loc, String domain, int turnover) {
		this.comId = comId;
		this.name = name;
		this.loc = loc;
		this.domain = domain;
		this.turnover = turnover;
	}
}

public class Ex04PreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/companies";
		String userName = "root";
		String pass = "root@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, userName , pass);
		
		
		Company c1 = new Company(101 , "Meta" , "California" , "Social Media" , 2);
		Company c2 = new Company(202 , "Apple" , "NewYork" , "Electronics " , 3);
		Company c3 = new Company(303 , "Amazon" , "Amsterdam" , "E-Commerce" , 3);
		Company c4 = new Company(404 , "Netflix" , "California" , "OTT" , 1 );
		Company c5 = new Company(505 , "Google" , "Sweden" , "Sech Engine" , 4);
		
		
		PreparedStatement pst = con.prepareStatement("insert into companyDetails values(?,?,?,?,?)");
		
//		pst.setInt(1, c1.comId);
//		pst.setString(2 , c1.name);
//		pst.setString(3, c1.loc);
//		pst.setString(4, c1.domain);
//		pst.setInt(5, c1.turnover);
//		
//		int result1 = pst.executeUpdate();
//		
//		pst.setInt(1, c2.comId);
//		pst.setString(2 , c2.name);
//		pst.setString(3, c2.loc);
//		pst.setString(4, c2.domain);
//		pst.setInt(5, c2.turnover);
//		
//		int result2 = pst.executeUpdate();
//		
//		pst.setInt(1, c3.comId);
//		pst.setString(2 , c3.name);
//		pst.setString(3, c3.loc);
//		pst.setString(4, c3.domain);
//		pst.setInt(5, c3.turnover);
//		
//		int result3 = pst.executeUpdate();
//		
//		pst.setInt(1, c4.comId);
//		pst.setString(2 , c4.name);
//		pst.setString(3, c4.loc);
//		pst.setString(4, c4.domain);
//		pst.setInt(5, c4.turnover);
//		
//		int result4 = pst.executeUpdate();
//		
//		pst.setInt(1, c5.comId);
//		pst.setString(2 , c5.name);
//		pst.setString(3, c5.loc);
//		pst.setString(4, c5.domain);
//		pst.setInt(5, c5.turnover);
//		
//		int result5 = pst.executeUpdate();
//		
//		System.out.println((result1+result2+result3+result4+result5) + " records inserted");
		
		
//		PreparedStatement pstUpdate = con.prepareStatement("update companyDetails set name = ? where comId = ?");
//		
//		pstUpdate.setString(1, "Microsoft");
//		pstUpdate.setInt(2, 101);
//		
//		pstUpdate.executeUpdate();
		
//		PreparedStatement pstDelete = con.prepareStatement("delete from companyDetails where comId=?");
//		pstDelete.setInt(1, 404);
//		
//		pstDelete.executeUpdate();
		
		PreparedStatement pstmt =  con.prepareStatement("select * from companyDetails");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			System.out.println("Company Id : " + rs.getInt(1));
			System.out.println("Company Name : " + rs.getString(2));
			System.out.println("Company Location : " + rs.getString(3));
			System.out.println("Company Domain : " + rs.getString(4));
			System.out.println("Company Turnover : " + rs.getInt(5));
		}
	}

}
