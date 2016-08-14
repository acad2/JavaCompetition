/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Now list can contain the duplicate element but set contains only unique element 
		HashSet<String> hm=new HashSet<String>();
		hm.add("Niraj");
		hm.add("pankaj");
		hm.add("hello");
		hm.add("world");
		Iterator itr=hm.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}
		System.out.println(" ");
		// to copy the set content in the LinkedList and then we can use the listiterator to reverse
	    LinkedList<String> ll=new LinkedList<String>(hm);
	    ListIterator<String> litr=ll.listIterator();
	    while(litr.hasPrevious()){
	        System.out.println(litr.previous());
	    }
	}
}
