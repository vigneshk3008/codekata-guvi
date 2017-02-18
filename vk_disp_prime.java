import java.util.*;
import java.io.*;
public class HelloWorld
{
     public static void main(String []args)
     {
          int ini,tar,n1=0,b=0;
          Scanner in=new Scanner(System.in);
          System.out.println("Enter the initial value:");
          ini=in.nextInt();
          System.out.println("Enter the target value:");
          tar=in.nextInt();
          //n1=ini/2;
          for(int j=ini;j<tar;j++)
          {

            for(int i=2;i<j;i++)
            {
              if((j%i)==0)
              {
                //System.out.println("the given number is not a prime number");
                b=0;
                break;
              }
              else
                b=1;
            }      
            if(b==1)
            {
                System.out.println(j);
            }
            ///ini++;
          }     
     }    
}          
