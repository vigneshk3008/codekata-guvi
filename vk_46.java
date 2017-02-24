import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+n+"="+(i*n));
        }
     }
}
