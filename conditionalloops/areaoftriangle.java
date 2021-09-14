package conditionalloops;
import java.util.Scanner;

public class areaoftriangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Breath:");
        int b=sc.nextInt();
        System.out.print("Hieght:");
        int h=sc.nextInt();
        double a= (b*h)/2f;
        System.out.print("Area: "+a);

    }
    
}
