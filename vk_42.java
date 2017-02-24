import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        String s1="",s2="";
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        int l1,l2,i,j,temp=1;
        l1=s1.length();
        l2=s2.length();
        char []c1=new char[l1];
        char []c2=new char[l2];
        for(i=0;i<l1;i++)
        {
            c1[i]=s1.charAt(i);
        }
        for(j=0;j<l2;j++)
        {
            c2[j]=s2.charAt(j);
        }
        if(l1!=l2)
        {
            System.out.println("the given String is not equal");
        }
        else
        {
            for(i=0;i<l1;i++)
            {
                if(c1[i]==c2[i])
                {
                    temp++;
                }//System.out.println(temp);
            }
            if(temp==(l1+1))
            {
                System.out.println("the given strings are equal");
            }
            else
            {
                System.out.println("the given strings are not equal");
            }
        }
     }
}
