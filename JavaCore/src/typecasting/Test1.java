package typecasting;

public class Test1 {
     public static void main(String[] args) {
    	 int x;//32 bit of data
    	 long y=23456789L;//64 bits of data
    	 x=(int)y;
    	 System.out.println(x);
    	 
    	 float m=234.66f;
    	 int n=(int)m;
    	 System.out.println(n);
    	 
    	 //    String name="Upasana";
    	 //  char nn=(char)name;
    	 
    	 // char k='y';
    	 //String l=(String)k;
    	 
    	 char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' }; // an array of chars
         String helloString = new String(helloArray); 
         System.out.println(helloString);
    	 
     }

}
