/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Hello");
		al.add("Amioha");
		al.add("Index");
		al.add("Bishyu");
		Collections.sort(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		for(int i=5;i>1;i--){
		    al1.add(i);
		}
		Collections.sort(al1);
		Iterator itr1=al1.iterator();
		while(itr1.hasNext()){
		    System.out.println(itr1.next());
		}
	}
}
