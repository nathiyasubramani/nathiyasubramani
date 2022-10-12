package abstraction;

public abstract class Person {
	String name;
	int age;
	
	public Person() {
	
	}
	public Person(String name,int age)
	{
	    this.name=name;
	    this.age=age;
	    System.out.println("Person Constructor");
	}
	    public abstract void doSomething();//no body
	    //normal/instance method with body
	    public void talk()
	    {
	    	System.out.println("People talk to each other to express their feelings");
	    }
	    
}
