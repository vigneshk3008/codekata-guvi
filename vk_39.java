import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        int []a=new int[10];
        int i,max=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of 10 numbers :");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(i=0;i<10;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Maximum value of 10 numbers is : "+max);
     }
}
