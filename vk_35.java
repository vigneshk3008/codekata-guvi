/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws Exception
	{
		String str;
		int count1=0,count2=0,count3=0;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z')
			{
				count1++;
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				count2++;
			}
			else
			{
				count3++;
			}
		}
		System.out.println("number of special characters in "+str+" is "+count3);
	}
}
