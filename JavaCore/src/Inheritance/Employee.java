package Inheritance;

public class Employee extends Person{
	int  empId;
	public Employee(String name,int age,int empId)
	{
		//super() calls the constructor of super class
		//public person(){}
		super(name,age);
		this.empId=empId;
		System.out.println("Employee Constructor");
	}
	public void doSomething()
    {
        System.out.println("Employee work to earn their  salary");
    }

}

