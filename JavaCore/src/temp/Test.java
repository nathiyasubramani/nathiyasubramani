package temp;

import java.util.Scanner;

//import java.lang.*;

public class Test {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter your name ");
		String name=scn.next();
		System.out.println("Please enter the year of birth ");
		int year=scn.nextInt();
		System.out.println("hello "+name+"!! welcome to the world of java you were born in the "+year);
				
		
		System.out.println("Please enter your first name");
        String fName=scn.next();
        System.out.println("Please enter your last name");
        String lName=scn.next();
        System.out.println("Hello "+fName+" "+lName);

	}
	

}
