package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRecords {
public static void main(String[] args) {
		
		try
		{
			String url="jdbc:mysql://localhost:3306/javadb";
			String username="root";
			String password="root";//user password
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connected Successfully");	
			
			/***********New code*****************/
			
			String query="insert into customer values(107,'Rob',99954,'rb@gmail.com');";//query to be executed against DB
			Statement stmt=con.createStatement();//to create SQL Statement
			
		    stmt.executeUpdate(query);
		    System.out.println("One record inserted successfully");
			
			/*************New code************/
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong");
		}
		
	}


}
