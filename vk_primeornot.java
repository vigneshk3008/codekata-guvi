import java.util.*;
import java.io.*;
public class HelloWorld
{
     public static void main(String []args)
     {
          int n,n1=0,b=0;
          Scanner in=new Scanner(System.in);
          System.out.println("Enter the value:");
          n=in.nextInt();
          n1=n/2;
          for(int i=2;i<n1;i++)
          {
              if((n%i)==0)
              {
                System.out.println("the given number is not a prime number");
                b=1;
                break;
              }
          }    
              if(b==1)
              {
                System.out.println("the given number is prime number");
              }    
     }     
}
