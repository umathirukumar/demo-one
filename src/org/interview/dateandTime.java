package org.interview;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateandTime {
	public static void main(String[] args) {
		
	
	DateFormat  dt=new SimpleDateFormat("yy/dd/mm  HH:mm:ss");
	Date d=new Date();
	String format = dt.format(d);
	System.out.println(format);

}
}  
