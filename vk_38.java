import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of number 1 :");
        a=sc.nextInt();
        System.out.println("Enter the value of number 2 :");
        b=sc.nextInt();
        System.out.println("Enter the value of number 2 :");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("the max of given 3 number is "+a);
        }
        else if(b>c)
        {
            System.out.println("the max of given 3 number is "+b);
        }
        else
            System.out.println("the max of given 3 number is "+c);
     }
}
