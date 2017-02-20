import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        String s;
        int i;
        Scanner scan=new Scanner(System.in);
        s=scan.nextLine();
        int len=s.length();
        int []res=new int[len];
        char c[]=s.toCharArray();
        System.out.println("the value of "+s+" is ");
        for(i=0;i<c.length;i++)
        {
            res[i]=c[i];
            System.out.print(res[i]+"\t");
        }
        System.out.println("");
     }
}
