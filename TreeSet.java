/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// NOw LInkedHAshSet maintains insertion order || TreeSet maintains the ascending order
		//TreeSet class implement navigable set interface that extend to the SortedSet interface
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Hello");
		ts.add("gimme");
		ts.add("sorted");
		ts.add("order");
		Iterator itr=ts.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}
	}
}
/*OUTPUT IS :
Hello
gimme
order
sorted
*/
