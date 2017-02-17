import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args)
     {
          int n,pr;
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the value");
          n=in.nextInt();
          System.out.println("Enter the power value");
          pr=in.nextInt();
          double op=Math.pow(n,pr);
          System.out.println(n+" ^ "+pr+" is "+op);
     }
}     
