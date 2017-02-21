import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of number 1 :");
        a=sc.nextInt();
        System.out.println("Enter the value of number 2 :");
        b=sc.nextInt();
        System.out.println("the value before swapping of number1 is "+a+" and number2 is "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("the value after swapping of number1 is "+a+" and number2 is "+b);
     }
}
