package exception;

import java.sql.Connection;
import java.sql.DriverManager;

public class Sample {
	public static void main(String[] args)
	{
		try
		{
			int x=10;
			int y=0;
			int z=x/y;//logical issue
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong");
		}
		//Connection con=DriverManager.getConnection("","","");
	}

}
