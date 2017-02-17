import java.util.*;
public class HelloWorld{

     public static void main(String []args){
       int n;
       Scanner a=new Scanner(System.in);
       n = a.nextInt();
    if(n<0)
    {
      System.out.println("the given number is negative");
    }
    else if(n==0)
    {
      System.out.println("the given number is zero");
    }
    else if(n>0)
    {
      System.out.println("the given number is positive");
    }
     }
}
