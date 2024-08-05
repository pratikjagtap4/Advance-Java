package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class marvelMovies
{
	String name ;
    int income ;
    int YOR ;
    String hero ;
}

public class Ex03PreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/marvel";
		String userName = "root";
		String pass = "root@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, userName , pass);
		PreparedStatement pst = con.prepareStatement("insert into marvelStory values (?,?,?,?,?)");	
		
//		pst.setInt(1, 101);
//		pst.setString(2 , "Avenger");
//		pst.setInt(3, 5000);
//		pst.setInt(4,  2022);
//		pst.setString(5, "Iron");
//		
//		int result1 = pst.executeUpdate();
//		System.out.println(result1);
		
//		pst.setInt(1, 202);
//		pst.setString(2 , "Avenger Infinity wars");
//		pst.setInt(3, 2000);
//		pst.setInt(4,  2019);
//		pst.setString(5, "Thor");
//		
//		int result2 = pst.executeUpdate();
//		
//		
//		pst.setInt(1, 303);
//		pst.setString(2 , "Spider-Man");
//		pst.setInt(3, 1000);
//		pst.setInt(4,  2017);
//		pst.setString(5, "Peter Parker");
//		
//		int result3 = pst.executeUpdate();
//		
//		
//		pst.setInt(1, 404);
//		pst.setString(2 , "Ant Man");
//		pst.setInt(3, 1500);
//		pst.setInt(4,  2018);
//		pst.setString(5, "Ant Man");
//		
//		int result4 = pst.executeUpdate();
		
		
//		PreparedStatement pstUpdate = con.prepareStatement("update marvelStory set name = ? where movieId = ?");
//		
//		pstUpdate.setString(1, "Bahubali");
//		pstUpdate.setInt(2, 202);
//		
//		int result5 = pstUpdate.executeUpdate();
//		System.out.println(result5);
		
		PreparedStatement pstDelete= con.prepareStatement("delete from  marvelStory where movieId = ?");
		
		pstDelete.setInt(1 , 404);
		int result6 = pstDelete.executeUpdate();
		System.out.println(result6);
		
	}
	

}
