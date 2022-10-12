package constructor;

public class TestPerson {
	
	public static void main(String[] args)
	{
		Person p1=new Person();
		p1.name="Nathiya";
		p1.age=36;
		p1.address="TamilNadu";
		p1.phone=24324354;
		
		Person p2=new Person("Harssith",8,"UK",79849564);
		Person p3=new Person("Thanvi",4,"India",85748355);
		Person p4=new Person("Subu",8);
		p4.address="USA";
		p4.phone=85634868;
		
	}

}
