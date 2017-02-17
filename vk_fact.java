import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args)
     {
          int n,n1,fact=1;
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the value");
          n=in.nextInt();
          n1=n;
          while(n>0)
          {
              fact=fact*n;
              n--;
          }
          System.out.println("the factoiral of "+n1+" is "+fact);
     }
}     
