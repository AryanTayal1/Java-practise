package conditionalloops;
import java.util.Scanner;

public class perimeterofcircle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Radius:");
        int r=sc.nextInt();
        float a=r*44/7f;
        System.out.println("Area of Circle :"+a);
    }
}
