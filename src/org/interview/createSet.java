package org.interview;


	import java.util.*;  
	
	class createSet{  
	 public static void main(String args[]){  
	  
	 HashSet<String> set=new HashSet<String>();
	  	set.add("Volvo");
	    set.add("BMW");
	    set.add("Ford");
	    set.add("Mazda");
	    set.add("BMW");
	  Iterator<String> itr=set.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  

