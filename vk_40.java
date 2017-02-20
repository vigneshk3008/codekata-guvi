/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws Exception
	{
		int n,f=0,s=1,temp;
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the value : ");
         n=in.nextInt();
         System.out.println("the fibonacci series of "+n+" is:");
         for(int i=0;i<=n;i++)
         {
             if(i<=1)
                temp=i;
             else
             {
                 temp=f+s;
                 f=s;
                 s=temp;
             }
             System.out.print(" "+temp);
         }
	}
}
