package Interface;

public class Employee extends Person implements Artist,Player
{
	public void doSomething()
	{
		System.out.println("Every employer has job profile to perform his duty");
	}
	
	public void doArt()
	{
		System.out.println("Employees acn also be interested in some art");
	}
	
	public void doPlay()
	{
		System.out.println("Playing something is good for mental and physical");
	}
	public void do1()
	{
		System.out.println("Everything is doable");
	}

}
