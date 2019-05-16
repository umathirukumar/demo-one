package org.interview;

import java.util.ArrayList;
import java.util.List;

public class createList {
	 
		  public static void main(String[] args) { 
		    List<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    for (int i = 0; i <cars.size(); i++) {
		    	//String string = cars.get(i);
		    	System.out.println(cars.get(i));
				
			}
		   // for (String i : cars) {
		    //  System.out.println(i);
		   // }
		  } 
		}



