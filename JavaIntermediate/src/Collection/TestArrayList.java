package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList(4);
		list.add("Upasana");
		list.add("Upasana");
		list.add("Rahul");
		list.add("Simran");
		System.out.println(list);
		
		Set<String> set=new HashSet();//no sorted
		set.add("Banana");
		set.add("Apple");
		set.add("Fig");
		set.add("Banana");
		set.add("Guava");
		set.add("Pineapple");
		set.add("Mango");
		System.out.println(set);
		
		Set<String> set1=new TreeSet();//sorted
		set1.add("Banana");
		set1.add("Apple");
		set1.add("Fig");
		set1.add("Banana");
		set1.add("Guava");
		set1.add("Pineapple");
		set1.add("Mango");
		System.out.println(set1);
		

     }
}
