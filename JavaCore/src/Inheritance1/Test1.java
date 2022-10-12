package Inheritance1;

import Inheritance1.Manager;

public class Test1 {
	public static void main(String[] args)
	{
		//Person p=new Person();
		
		//employee e=new Employee();
		
		Manager m=new Manager("Upasana",32,1001,"Training");
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.empId);
		System.out.println(m.dept);
		m.doSomething();
		
		Employee emp=new Employee();//parent
        emp.display();
        Manager man=new Manager();
        man.display();//display from manager
        Employee e1=(Employee)man;
        e1.display();
        
        Employee emp1=new Employee();
        Person p=(Person)emp1;
        p.doSomething();

}
}