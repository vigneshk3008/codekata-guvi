import java.util.*;
public class HelloWorld{

     public static void main(String []args){
       int a;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the year to check leap or not");
       a = in.nextInt();
       if((a%100)==0)
       {
           if((a%400)==0)
            System.out.println("the given year is leap year");
           else
            System.out.println("the given year is not a leap year");
       }
       else
       {
           if((a%4)==0)
            System.out.println("the given year is leap year");
           else
            System.out.println("the given year is not a leap year");
       }
       }
}
