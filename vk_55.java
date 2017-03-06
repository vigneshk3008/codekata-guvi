import java.util.*;
import java.io.*;
public class HelloWorld{
     public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
    String s=read.nextLine();
    String str=s.substring(0,1);
    try{
    	int digit=Integer.parseInt(str);
    	System.out.printf("True\n");
    }
     catch(Exception e){
     	System.out.print("False");
    }
}
}
