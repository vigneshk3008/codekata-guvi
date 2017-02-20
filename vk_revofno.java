import java.util.*;
import java.io.*;

public class HelloWorld{
     public static void main(String []args)throws Exception{
         int n1,temp=0;
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the first value : ");
         n1=in.nextInt();
         System.out.println("the reverse of "+n1+" is: ");
         String len=new Integer(n1).toString();
         int a[]=new int[len.length()];
         for(int i=0;i<len.length();i++)
         {
             temp=n1%10;
             a[i]=temp;
             n1/=10;
             System.out.print(temp);
         }
         System.out.println("");
    }
}
