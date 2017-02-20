import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
         int n,sum=0;
         Scanner s=new Scanner(System.in);
         n=s.nextInt();
         int n1=n;
         for(int i=1;i<=n1;i++)
         {
             sum=sum+i;
         }
         System.out.println(sum);
     }
}
