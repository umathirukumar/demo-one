package org.interview;



	interface FirstInterface {
		  public void myMethod(); 
		}

	interface SecondInterface {
		  public void myOtherMethod(); 
		}
	
	class Face implements FirstInterface, SecondInterface {
		  public void myMethod() {
		    System.out.println("First Interface Method \n");
		  }
		  public void myOtherMethod() {
		    System.out.println("Second Interface Method");
		  }
	
		  public static void main(String[] args) {
		   Face myObj = new Face();
		    myObj.myMethod();
		    myObj.myOtherMethod();
		  }
		}
