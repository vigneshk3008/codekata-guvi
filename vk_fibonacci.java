import java.util.*;
import java.io.*;

public class HelloWorld{
     public static void main(String []args){
         int n,n1=0,n2=1,res;
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the value : ");
         n=in.nextInt();
         System.out.println("the fibonacci series of "+n+" is:");
         for(int i=0;i<=n;i++)
         {
             if(i<=1)
                res=i;
             else
             {
                 res=n1+n2;
                 n1=n2;
                 n2=res;
             }
             System.out.print(" "+res);
         }
     }    
}
