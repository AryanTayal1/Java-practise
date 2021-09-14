package conditionalloops;
import java.util.Scanner;
public class areaofrohmbus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Diagonal 1:");
        int d1 =sc.nextInt();
        System.out.print("Diagonal 2:");
        int d2=sc.nextInt();
        float a =d1*d2/2f;

        System.out.println("Area of Rohmbus is " +a);
    }
    
}
