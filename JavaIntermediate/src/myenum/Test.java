package myenum;

public class Test {
	
	public static void main(String[] args)
	{
		Colors myColor=Colors.RED;
		System.out.println(myColor);
		
		MsgStatus mobj=MsgStatus.READ;
		System.out.println(mobj.getMsg());
	}

}
