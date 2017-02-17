import java.util.*;
public class HelloWorld{

     public static void main(String []args){
       String n_str;
       Scanner a=new Scanner(System.in);
       n_str = a.next();
       char[] n_ch = n_str.toCharArray();
       if((n_ch[0]>='a') && (n_ch[0]<='z') || (n_ch[0]>='A') && (n_ch[0]<='Z'))
        System.out.println("the given char is Alphabet");
       else
        System.out.println("the given char is not an Alphabet");
    
     }
}
