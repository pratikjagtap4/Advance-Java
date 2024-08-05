package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class Employee {
	int empId  ;
	String name;
	String dept;
	int salary;
	
	
	public Employee(int empId, String name, String dept, int salary) {
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
}

interface EmployeeDAO {
	void saveEmp(Employee emp) throws ClassNotFoundException, SQLException;
	void readEmp() throws ClassNotFoundException, SQLException ;
	void deleteEmp(int id) throws ClassNotFoundException, SQLException;
	void updateEmp(int i) throws ClassNotFoundException, SQLException;
	void readSingleEmp(int did) throws ClassNotFoundException, SQLException;
}

class EmployeeDAOImp implements EmployeeDAO{
	
	static String url  = "jdbc:mysql://localhost:3306/employeeDao";
	static String user = "root";
	static String pass = "root@123";
	
	
	private static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,user,pass);
	}
	
	public void saveEmp(Employee emp) throws ClassNotFoundException, SQLException {

			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("insert into employeeData values(?,?,?,?)");
			
			pst.setInt(1, emp.empId);
			pst.setString(2, emp.name);
			pst.setString(3, emp.dept);
			pst.setInt(4, emp.salary);
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
	}
	
	
	public void readEmp() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("select * from employeeData");		
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | "  + rs.getString(4)  );
		}
		pst.close();
		con.close();
	}
	
	public void readSingleEmp(int id ) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("select * from employeeData where id =?");		
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		
		
		System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | "  + rs.getString(4)  );
		
		pst.close();
		con.close();
	}
	
	public void deleteEmp(int id) throws ClassNotFoundException, SQLException{
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("delete from employeeData where id = ?");
		
		pst.setInt(1, id);
		pst.executeUpdate();
	}
	
	public void updateEmp(int id) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("update employeeData set salary=? where id =?");
		
		pst.setInt (1, 7000000);
		pst.setInt(2, id);
		pst.executeUpdate();
		
		pst.close();
		con.close();
	}
	
}


public class Ex05DAO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeDAO empdao = new EmployeeDAOImp();
//		empdao.saveEmp(new Employee(101, "Pratik" , "Developer" , 70000));		
//		empdao.saveEmp(new Employee(202, "Swapnil" , "Developer" , 60000));
//		empdao.saveEmp(new Employee(303, "Tushar" , "Tester" , 50000));
//		empdao.saveEmp(new Employee(404, "Dhanajay" , "Animator" , 55000));
//		empdao.saveEmp(new Employee(505, "Shubham" , "Doctor" , 80000));
//		empdao.saveEmp(new Employee(606, "Lucky" , "System Engineer" , 40000));
//		empdao.saveEmp(new Employee(707, "Yash" , "BusinessMan" , 50000));
//		empdao.saveEmp(new Employee(808, "Anurag" , "Tech lead" , 90000));
//		empdao.saveEmp(new Employee(909, "Pingale" , "Tech Archiitect" , 120000));
//		empdao.saveEmp(new Employee(1001, "Rohan" , "Devops" , 110000));
		
		empdao.readEmp();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter id of employee you want to delete \n");
		int id = sc.nextInt();
		empdao.deleteEmp(id);	
		empdao.readEmp();

		
		
		System.out.println("\n \nEnter id of employee you want to update \n \n ");
		int uid = sc.nextInt();
		empdao.updateEmp(uid);
		empdao.readEmp();
		
		System.out.println("\nEnter id of emp you want to display");
		int did = sc.nextInt();
		empdao.readSingleEmp(did);
		
		sc.close();
	}
}