/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Now i am using the priority queue it's in the FIFO order
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Hello");
		pq.add("World");
		pq.add("seems");
		pq.add("to be easy");
		
		System.out.println(pq.peek());
		Iterator itr=pq.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}
		System.out.println(pq.remove());
		Iterator itr1=pq.iterator();
		while(itr1.hasNext()){
		System.out.println(itr1.next());
		    
		}
	}
}
