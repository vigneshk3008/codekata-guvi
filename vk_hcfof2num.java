import java.util.*;
import java.io.*;

public class HelloWorld{
     public static void main(String []args){
         int n1,n2,hcf=0;
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the first value : ");
         n1=in.nextInt();
         System.out.println("Enter the second value : ");
         n2=in.nextInt();
         int min=Math.min(n1,n2);
         for(int i=min;i>=1;i--)
         {
             if((n1%i==0) && (n2%i==0))
             {
                 hcf=i;
                 break;
             }
         }
         System.out.println("the hcf of given two numbers is "+hcf);
    }
}
