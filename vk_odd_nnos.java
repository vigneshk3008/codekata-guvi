import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args)
     {
          int ini,tar,count=0;
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the starting value");
          ini=in.nextInt();
          int n=ini;
          System.out.println("Enter the target value");
          tar=in.nextInt();
          for(int i=0;i<tar;i++)
          {
              if((n%2)!=0)
              {
                  count=count+1;
                  System.out.print(" "+n);
                  n+=1;
              }
              else
              {
                  n+=1;
              }
          }
          System.out.println("the number of odd numbers between "+ini+" to "+tar+" is "+count);
     }
}
