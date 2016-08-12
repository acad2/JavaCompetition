/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Now we are going to use the list iterator that provide the functionality of the forward and the bacward traversing
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
		    al.add(i);
		}
		ListIterator<Integer> litr=al.listIterator();
		while(litr.hasNext()){
		    System.out.println(litr.next());
		}
		System.out.println("   ");
		while(litr.hasPrevious()){
		    System.out.println(litr.previous());
		}
	}
}
