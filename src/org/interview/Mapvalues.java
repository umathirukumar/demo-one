package org.interview;

import java.util.HashMap;
import java.util.Map;

public class Mapvalues {

	 public static void main(String args[]){  
		   HashMap<Integer,String> hm=new HashMap<Integer,String>();
		  
		      hm.put(100,"Volvo");    
		      hm.put(101,"BMW");    
		      hm.put(102,"Ford");   
		      hm.put(105,null);
		      hm.put(103,"Mazda");
		      hm.put(107,"Volvo");
		      
		      System.out.println("Initial HashMap of elements:");  
		     for(Map.Entry m:hm.entrySet())  
		     {  
		        System.out.println(m.getValue());   
		     }  
	 }

	
	
}
