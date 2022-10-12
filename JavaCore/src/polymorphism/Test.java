package polymorphism;

public class Test {
	public static void main(String[] args) {
		Liquid l=new Liquid();
		Milk m=new Milk();
		Tea t=new Tea();
		Coffee c=new Coffee();
		Mug mg=new Mug();
		mg.addLiquid(t);
		mg.addLiquid(m);
		mg.addLiquid(l);
		mg.addLiquid(c);
	}

}
