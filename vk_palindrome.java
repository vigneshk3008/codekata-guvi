import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args)
     {
          int n,n1,rev=0,rem;
          Scanner in=new Scanner(System.in);
          n=in.nextInt();
          n1=n;
          while(n!=0)
          {
              rem=n%10;
              rev=rev*10+rem;
              n=n/10;
          }
          if(n1==rev)
            System.out.println("the given number "+n1+" is palindrome.");
          else
            System.out.println("the given number "+n1+" is not a palindrome.");
     }
}
