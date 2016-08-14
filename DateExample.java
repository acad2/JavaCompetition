/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.text.DateFormat;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Date d=new Date();
	    //this is the simple way to print the date
	    System.out.println(d);
	    // Now if we want to extract some particular format then the things need to do
	   
	    String dateToStr=DateFormat.getInstance().format(d);
	    // xx/xx/xx xx:xx AM/PM
	    System.out.println("This is formated "+dateToStr);
	    
	    dateToStr=DateFormat.getDateInstance().format(d);
	    // Aug XX, XXXX
	    System.out.println("This is the another format "+dateToStr);
	    
	    dateToStr=DateFormat.getTimeInstance().format(d);
	    // x:xx:xx AM/PM
	    System.out.println(dateToStr);
	    
	    dateToStr=DateFormat.getTimeInstance(DateFormat.SHORT).format(d);
	    // X:XX AM/PM
	    System.out.println(dateToStr);
	    // we can use getTimeInstance(DateFormat.LONG/MEDIUM)
	    //DateFormat.MEDIUM: X:XX:XX PM/AM
	    //DateFormat.LONG: X:XX:XX PM/AM IST
	}
}
