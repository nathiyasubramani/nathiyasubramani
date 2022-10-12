package userdefined;

public class Election {
	
	public void checkEligibility(int age)throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("You should be min 18 to vote");
		else
			System.out.println("please cast your vote");
	}

}
