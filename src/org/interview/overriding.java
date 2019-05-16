package org.interview;

public class overriding extends overloading{
	
	public void add()
	{
		System.out.println("Overriding Method Is Excecuted.\n");
	}

	public void add(int a)
	{
		System.out.println("Overriding Method A Integer Value Is:"+a+"\n");
		
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Overriding Method A Integer Value Is:"+a+"\n");
		System.out.println("Overriding Method B  Integer Value Is: "+b+"\n");
		System.out.println("Overriding Method C Integer Value Is: "+c+"\n");
		int s=a+b+c;
		System.out.println("Total Value Is: "+s+"\n");
	
	}
	public static void main(String[] args) {
		overriding obj=new overriding();
		obj.add();
		obj.add(2);
		obj.add(3, 6, 9);
	}
}
