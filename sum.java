import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args)
     {
          int n,i=1,sum=0; 
        Scanner input=new Scanner(System.in); 
        System.out.print("Enter Number :"); 
        n=input.nextInt(); 
        do 
            { 
                 sum=sum+i; 
                 i +=1; 
            }   while(i<=n); 
                 System.out.println("Sum of First " + n + " Numbers = "+sum); 
     
     }
}
