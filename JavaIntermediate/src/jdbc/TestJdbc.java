package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	
	public static void main(String[] args) {
		
		try
		{
			String url="jdbc:mysql://localhost:3306/javadb";
			String username="root";
			String password="root";//user password
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connected Successfully");	
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong");
		}
		
	}
	
}
