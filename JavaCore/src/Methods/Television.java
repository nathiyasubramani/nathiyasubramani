package Methods;

public class Television {
	String brand;
	int price;
	int screensize;
	
	//method which takes nothing and returns nothing
	public void turnon()
	{
		System.out.println("shows display");
	}
	
	//method which takes nothing and returns something(int)
	public int switchToAChannel() {
		return 1;
	}
	
	//method which takes nothing and returns something(double)
	public double getDiscount()
	{
		return (price*10/100);
	}
    //method which takes something(double) and returns something(double)
	public double discountOnBlackFriday(int dis)
	{
		System.out.println("");
		return (price*dis/100);
	}
	public double dicountWithCityBank(int dis, int cityDiscount)
    {
        System.out.println("");
        int totalDiscount=dis+cityDiscount;
        return (price*(totalDiscount)/100);
        
    }

}
