import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        String ip;
        char c;
        int nu;
        Scanner n=new Scanner(System.in);
        do
        {
            System.out.println("the program will terminate when the user press Q");
            ip=n.nextLine();
            c = ip.charAt(0);
            nu=c;
        }while(nu!=81);
     }
}
