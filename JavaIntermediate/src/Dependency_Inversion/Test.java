package Dependency_Inversion;

public class Test {
	public static void main(String[] args)
	{
		WeatherTracker W=new WeatherTracker();
		Phone p=new Phone();
		p.alertWeatherConditions(null);
		Email E= new Email();
		E.alertWeatherConditions(null);
		
		W.setConditions("rainy");
		System.out.println(W.getConditions());
	}

}
