package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private static Connection con;
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			System.out.println("Connected!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection(){
		return con;
	}
	 
	
}
