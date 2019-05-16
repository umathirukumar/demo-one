package org.interview;

abstract  class A
{
	public void call()
	{
		System.out.println("Calling....\n");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}
public class programabstract extends A{

	@Override
	public void move() {
		System.out.println("Moving ... .. ");
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("Dancing...  \n");
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("Cooking....\n");
	}
	public static void main(String[] args) {
		programabstract ab=new programabstract();
		ab.call();
		ab.cook();
		ab.dance();
		ab.move();
	}

}
