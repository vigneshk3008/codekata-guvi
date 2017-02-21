import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of number 1 :");
        n1=sc.nextInt();
        System.out.println("Enter the value of number 2 :");
        n2=sc.nextInt();
        System.out.println("the value before swapping of number1 is "+n1+" and number2 is "+n2);
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("the value after swapping of number1 is "+n1+" and number2 is "+n2);
     }
}
