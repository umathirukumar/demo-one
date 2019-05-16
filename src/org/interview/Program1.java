package org.interview;

public class Program1 extends Program {
	public void view() {
		int a=20;
		System.out.println("child classs  \n");
		System.out.println("child class variable value:  "+a);
	}
	public static void main(String[] args) {
		Program1 obj=new Program1();
		obj.show();
		obj.view();
	}

}
