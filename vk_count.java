import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args)
     {
        String n;
        int count=0;
        Scanner in=new Scanner(System.in);
        n = in.next();
        char []ch=n.toCharArray();
        for(int i=0;i<n.length();i++)
        {
            count=count+1;
        }
        System.out.println("the count of digits in an integer is"+" "+count);
     }
}
