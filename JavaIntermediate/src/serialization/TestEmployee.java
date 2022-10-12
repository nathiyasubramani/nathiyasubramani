package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {
	
	public static void main(String[] args)
	{
		Employee emp=new Employee(101,"Nathiya",10000,"Software developer","nathi123@gmail.com");
		try
		{
			//-------------------write operation-------------------
			//to create a file
			FileOutputStream fileOut=new FileOutputStream("object.txt");
			//to convert object into stream of bytes
			ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
			//to write into the file
			oOut.writeObject(emp);
			
			//---------------------read operation----------------------
			FileInputStream fileIn=new FileInputStream("object.txt");
			// to convert bytes to object
			ObjectInputStream oIn=new ObjectInputStream(fileIn);
			
			Employee empCopy=(Employee)oIn.readObject();
			System.out.println(empCopy.empId);
			System.out.println(empCopy.name);
			System.out.println(empCopy.designation);
			System.out.println(empCopy.salary);		
			System.out.println(empCopy.email);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

