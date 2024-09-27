package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex09BatchProcessingUsingPreparedStatements {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url  = "jdbc:mysql://localhost:3306/olympic";
		String user = "root";
		String pass = "root@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url , user , pass);
		PreparedStatement pst = con.prepareStatement("insert into olympicGames values (?,?,?,?)");
		
		con.setAutoCommit(false);
		
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Player Details ");
			
			System.out.print("EnterPlayer Id : ");
			int id = scInt.nextInt();
			
			System.out.println("Enter Game Name :");
			String game = scString.nextLine();
			
			System.out.println("Enter Player Name :");
			String name = scString.nextLine();
			
			System.out.println("Enter Player Rank : ");
			int rank = scInt.nextInt();
			
			pst.setInt(1, id);
			pst.setString(2, game);
			pst.setString(3, name);
			pst.setInt(4, rank);
			
			pst.addBatch();
			
			System.out.println("Do you want to continue (Y/N)");
			String decision = scString.nextLine();
			
			if(decision.toUpperCase().equals("N")) {
				break;
			}
		}
		
		int[] result = pst.executeBatch();
		
		System.out.println(result.length + " records inserted");
		
		con.commit();
		pst.close();
		con.close();
		
	}

}
