package intro;
import java.util.Scanner;
public class simpleinterest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Principle:");
        int p=sc.nextInt();
        System.out.print("Time:");
        int t=sc.nextInt();
        System.out.print("Rate:");
        int r=sc.nextInt();

        int x= p*r*t;
        System.out.print("Simple INterest:"+x);
    }    
}
