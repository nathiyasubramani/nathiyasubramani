package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample1 {
	public static void main(String[] args)
	{
		try
		{
			int x=10;
			int y=0;
			int z=x/y;//logical issue
			int[] nums=new int[5];
			nums[4]=200;
			Connection con=DriverManager.getConnection("","","");
			con.close();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("we can not div a num by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println("we can not place elements out of array's boundary");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Could not connect to the database");
		}
		finally
		{
			System.out.println("I will get executed always");
		}
         System.out.println("something after try catch");
		//Connection con=DriverManager.getConnection("","","");
	}

}

