import java.util.*;
public class HelloWorld{

     public static void main(String []args)
     {
        int n,sum=0;
        Scanner in=new Scanner(System.in);
        n = in.nextInt();
        int i=0;
        do
        {
            sum = sum+i;
            i++;
        }while(i<=n);
        System.out.println("the sum of n numbers is"+" "+sum);
     }
}
