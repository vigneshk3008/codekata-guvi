import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        int n1,n2,c,d;
        Scanner s=new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        c=n1*n2;
        d=c;
        for(int i=1;i<c;i++)
        {
            if(i%n1==0 && i%n2==0 && i<d)
                d=i;
        }
        System.out.println("the lcm of the given number is "+d);
     }
}
