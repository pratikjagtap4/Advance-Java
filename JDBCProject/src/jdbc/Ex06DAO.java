package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Product
{
	int id;
	String name;
	String company;
	int price;
	
	
	public Product(int id, String name, String company, int price) {
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
}

interface ProductDAO {
	void saveProduct(Product p) throws ClassNotFoundException, SQLException;
	void readProduct() throws ClassNotFoundException, SQLException;
	void  deleteProduct(int id) throws ClassNotFoundException, SQLException;
}

class ProductDAOimpl implements ProductDAO {
	static String url  = "jdbc:mysql://localhost:3306/product";
	static String user = "root";
	static String pass = "root@123";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,user,pass);
		
	}

	public void saveProduct(Product p) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("insert into productInfo values(?,?,?,?)");
		
		pst.setInt(1, p.id);
		pst.setString(2, p.name);
		pst.setString(3, p.company);
		pst.setInt(4, p.price);
		
		pst.executeUpdate();
		
		pst.close();
		con.close();
	}
	
	public void readProduct() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("select * from productinfo");
		
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " | "  +  rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getInt(4));
		}
		
		pst.close();
		con.close();
	}
	
	public void  deleteProduct(int id) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("delect from productInfo where id = ?");
		
		pst.setInt(1, id);
		
		pst.close();
		con.close();
	}
	
}
public class Ex06DAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductDAO obj = new ProductDAOimpl();
		
//		obj.saveProduct(new Product(101,"Laptop" , "HP" , 45000));
//		obj.saveProduct(new Product(202 , "Mobile" , "Samsung" , 15000));
//		obj.saveProduct(new Product(303, "wallet" , "woodland" , 2000));
//		obj.saveProduct(new Product(404, "bottle" , "cello" , 150 ));
//		obj.saveProduct(new Product(505 , "TV" , "Toshiba" , 32000));
//		
		obj.readProduct();
		
	}

}
