import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
         int a,b,gcd; 
         a=b=gcd=0; 
         Scanner s=new Scanner(System.in); 
         System.out.println("Enter two nos."); 
         a=s.nextInt() ; 
         b=s.nextInt(); 
         while(a!=0) 
         { 
            gcd=a; 
            a=b%a; 
            b=gcd; 
        } 
        System.out.println("GCD "+gcd);
     }
}
