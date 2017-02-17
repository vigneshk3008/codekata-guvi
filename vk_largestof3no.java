import java.util.*;
public class HelloWorld{

     public static void main(String []args){
       int a,b,c;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the value of First number");
       a = in.nextInt();
       System.out.println("Enter the value of Second number");
       b = in.nextInt();
       System.out.println("Enter the value of Third number");
       c = in.nextInt();
       if((a>b) && (a>c))
        System.out.println(a+" " + "is largest among the given three numbers");
       else if(b>c)
        System.out.println(b+" " + "is largest among the given three numbers");
       else
        System.out.println(c+" " + "is largest among the given three numbers");
     }
}
