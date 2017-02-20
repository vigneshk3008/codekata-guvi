/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str;
		int count=0;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		char []ch=str.toCharArray();
		for(int i=1;i<=ch.length;i++)
		{
			count=i;
		}
		System.out.println("the characters in the given string "+str+" is "+count);
	}
}
