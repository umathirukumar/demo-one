package org.interview;

import java.util.Scanner;

public class overloading {
	
		
	
		public void add(){
			
			System.out.println("No Arrgument Passing \n");
			
		}
		public void add(int a)
		{
			
		System.out.println("A Integer Value Is:"+a+"\n");
	
		}
		
		public void add(int a,int b)
		{
			System.out.println("A Integer Value Is:"+a+"\n");
			System.out.println("B  Integer Value Is: "+b+"\n");
		}
	
		public void add(double a,double b)
		{
			System.out.println("A Double Value Is:"+a+"\n");
			System.out.println("B  Double Value Is: "+b+"\n");
	
		}
		public static void main(String[] args) {
			overloading obj=new overloading();
			obj.add();
			obj.add(40);;
			obj.add(90, 30);;
			obj.add(50.60,70.60);
			
			
		}
}
