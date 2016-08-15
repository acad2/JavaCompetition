/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Now we are going to use the MAP interface. A map contains values on the basis of keys. IT uses the Key value pair know as entry. It contains only unique keys
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(null,null);
		//hm.put(1,"Heo");
		hm.put(2,"heya");
		hm.put(134,null);
		hm.put(12,"nikki");
		for(Map.Entry m:hm.entrySet()){
		    System.out.println(m.getKey()+" : "+m.getValue());
		}
		// now it may have one null key and multiple null values
	}
}
