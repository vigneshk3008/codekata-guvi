import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        int []n1=new int[5];
        int []n2=new int[5];
        int []sum=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
            n1[i]=s.nextInt();
        for(int i=0;i<5;i++)
            n2[i]=s.nextInt();
        for(int i=0;i<5;i++)
        {
            sum[i]=n1[i]+n2[i];
            System.out.print("  "+sum[i]);
        }
        
        
     }
}
