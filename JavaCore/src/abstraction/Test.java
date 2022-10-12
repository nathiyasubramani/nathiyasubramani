package abstraction;

public class Test {
	public static void main(String[] args)
	{
		//Person p=new Person();
		
		//employee e=new Employee();
		
		Person p1=new Employee();
		person p2=new Students();
		person p3=new Manager();
		
		Manager m=new Manager("Upasana",32,1001,"Training");
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.empId);
		System.out.println(m.dept);
		m.doSomething();
	}

}
