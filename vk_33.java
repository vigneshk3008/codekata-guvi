import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args)throws Exception{
        String s="";
        int count=0,i;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int len=s.length();
        //System.out.println(len);
        char []ch=new char[len+2];
        //System.out.println(ch.length);
        for(i=0;i<s.length();i++)
        {
 
            ch[i]= s.charAt(i);
 
            if( ((i>0)&&(ch[i]!='.')&&(ch[i-1]=='.')) || ((ch[0]!='.')&&(i==0)) )
            count++;
 
        }
        System.out.println("The words in given string ' "+s+"' is "+count);
    }
}
