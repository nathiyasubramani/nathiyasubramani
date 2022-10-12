package Interface_segregation;

import Interface_segregation.Dodo;
import Interface_segregation.Dodo1;
import Interface_segregation.Falcon;
import Interface_segregation.Falcon1;

public class Test {
	public static void main(String[] args) {
		Falcon f=new Falcon();
		f.fly();
		f.layEggs();
		f.getCurrentLocation();
		f.getNumberOfEggs();
		
		Dodo d=new Dodo();
		d.fly();
		d.layEggs();
		d.goExtinct();
		d.getCurrentLocation();
		d.getNumberOfEggs();
		
		Falcon f1=new Falcon();
		f1.fly();
		f1.layEggs();
		f1.getCurrentLocation();
		f1.getNumberOfEggs();
		
		Dodo d1=new Dodo();
		d1.fly();
		d1.layEggs();
		d1.goExtinct();
		d1.getCurrentLocation();
		d1.getNumberOfEggs();
		
		AreaCalculator ac=new AreaCalculator();
		System.out.println(ac.calculateShapeArea(r));
		System.out.println(ac.calculateShapeArea(c));
}
