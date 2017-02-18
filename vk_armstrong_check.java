import java.util.*;
import java.io.*;
public class HelloWorld
{
     public static void main(String []args)
     {
          int n,n1,rem,sum=0;
          int result;
          Scanner in=new Scanner(System.in);
          System.out.println("Enter the value:");
          n=in.nextInt();
          n1=n;
          String len=new Integer(n1).toString();
          //System.out.println(len.length());
          for(int i=0;i<len.length();i++)
          {
            rem=n%10;
            result=power(rem,len.length());
            n=n/10;
            //System.out.println(result);    
            sum=sum+result;
          }
          System.out.println("the result: "+sum);
          if(sum==n1)
            System.out.println("The given number is Armstrong number");
          else
            System.out.println("The given number is Not an Armstrong number");
     }
     public static int power(int a,int b)
     {
         int aa,ba;
         aa=a;
         ba=b;
         int resul=1;
         while(b!=0)
         {
             resul*=a;
             --b;
         }
         return resul;
     }
}
