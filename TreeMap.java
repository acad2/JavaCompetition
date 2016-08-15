/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Now TreeMap contains value based on the KEY. It implement the NavigableMap interface and extend the
		//AbstractMap class. It doesn't contain null value as the key and maintains ascending order
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1,"Niraj");
		tm.put(45,"Hiren");
		tm.put(3,"Bachan");
		for(Map.Entry m:tm.entrySet()){
		    System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
}
