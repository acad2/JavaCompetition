/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Now some difference between the HasMap and LinkedHashMap is that it maintains the insetion order
		// But in case of the hasMap it maintains no order 
		//It implements the Map interface and extends HashMap class
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1,"Hello");
		lhm.put(3,"order");
		lhm.put(2,"Nesh");
		for(Map.Entry m:lhm.entrySet()){
		    System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
}
