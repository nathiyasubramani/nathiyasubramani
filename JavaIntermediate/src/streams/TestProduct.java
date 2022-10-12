package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestProduct {
	
	public static void main(String[] args)
	{
		ArrayList<Product> prodList=new ArrayList();
        
        prodList.add(new Product(1001, "TV", 95000, 1, "Apple", 0));
        prodList.add(new Product(1002, "Tripod", 7000, 2, "Digitech", 100));
        prodList.add(new Product(1003, "CCTV Camera", 4500, 5, "Mi", 150));
        prodList.add(new Product(1004, "Mobile", 50000, 1, "Samsung", 0));
        prodList.add(new Product(1005, "Monitor", 16000, 4, "Dell", 100));
        prodList.add(new Product(1006, "Mouse", 1200, 15, "logitech", 50));
        prodList.add(new Product(1007, "TV", 35000, 2, "Apple", 0));
        prodList.add(new Product(1008, "TV", 75000, 2, "Apple", 0));
        // find all the products(name) with free delivery
        List<String> prodNames=prodList.stream()
        		.filter(kev->kev.deliveryCharges==0.0f)//inter method
        		.map(hasan->hasan.name)//inter method
        		.collect(Collectors.toList());//terminal method
        System.out.println(prodNames);
        
       Set<String> setNames=prodList.stream()        	
    		   .filter(kev->kev.deliveryCharges==0.0f)//inter method
        	   .map(hasan->hasan.name)//inter method
        	   .collect(Collectors.toSet());//terminal method
       System.out.println(setNames);
        
//        for(int i=0;i<prodList.size();i++) {
//        	if(prodList.get.deliveryCharges=0.0f)
//        	{
//        		if(prodList.get(i).deliveryCharges==0.0f)
//        		{
//        			if(prodList.get(i))
//        			{
//        				System.out.println(prodList.get(i).name);
//        			}
//        		}
//        	}
       
       //map<K,V> map<Integer,String> <String,String>
       
       Map<Integer,String> prodMap = prodList.stream()
    		   .collect(Collectors.toMap(x->x.prodId,y->y.brand));
       System.out.println(prodMap);
       
       System.out.println("Unsorted product list");
       prodList.stream()
                 .map(j->j.name)
                 .forEach(m->System.out.println(m));
       System.out.println("Sorted product list");
       prodList.stream()
                 .map(p->p.name)
                 .sorted().forEach(f->System.out.println(f));       
       
        }
	}


