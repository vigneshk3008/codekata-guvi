/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int odd()
	{
		int temp1=0;
		for(int i=15;i<=45;i+=2)
		{
			temp1+=i;
		}
		return temp1;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("the sum of numbers from 1 to 15 is "+sum());
		System.out.println("the sum of odd numbers from 15 to 45 is "+odd());
	}
	public static int sum()
	{
		int temp=0;
		for(int i=1;i<=15;i++)
		{
			temp+=i;
		}
		return temp;
	}
}
