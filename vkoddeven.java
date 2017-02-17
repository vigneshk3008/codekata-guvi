import java.util.*;
public class HelloWorld{

     public static void main(String []args){
       int n;
       Scanner a=new Scanner(System.in);
       n = a.nextInt();
    if((n%2)==0)
    {
      System.out.println("the given number is even");
    }
    else if((n%2)!=0)
    {
      System.out.println("the given number is odd");
    }
    
     }
}
