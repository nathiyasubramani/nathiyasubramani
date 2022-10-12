package FunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionTest {
	
    public static void main(String[] args) {
    	
    	//takes two args and return 1 args
    	//first two are the inputs and last one is output 
        BiFunction<Integer,Integer,Integer> bif=(a,b)->(a*b);
        System.out.println(bif.apply(22, 44));
        
        BiFunction<String,String,String> bif1=(a,b)->("hello "+a+" "+b);
        System.out.println(bif1.apply("John","Doe"));
        
        
    }
}
