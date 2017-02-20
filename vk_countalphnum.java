import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        String s;
        int i,count=0,count1=0,count2=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string:");
        s=scan.nextLine();
        char ch[]=s.toCharArray();
        for(i=0;i<ch.length;i++)
        {
            if((ch[i]>='A' && ch[i]<='Z')||(ch[i]>='a' && ch[i]<='z'))
                ++count;
            else if(ch[i]>='0' && ch[i]<='9')
                ++count1;
            else
                ++count2;
        }
        System.out.println("Number of alphabets in  given string is "+count);
        System.out.println("Number of numbers in  given string is "+count1);
        System.out.println("Number of special charaters in  given string is "+count2);
     }
}
