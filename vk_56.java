import java.util.*;
import java.io.*;
public class HelloWorld{
     public static void main(String[] args) {
        String title,name;
        Scanner sc=new Scanner(System.in);
                title=sc.nextLine();
        name=sc.next();
        char[] ch=name.toCharArray();
        System.out.println(title+","+ch[0]);
    }
}
