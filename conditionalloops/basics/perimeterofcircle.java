package conditionalloops;
import java.util.Scanner;

public class perimeterofcircle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Taking input of radius of circle
        System.out.print("Radius:");
        int r=sc.nextInt();
        // Calculated the perimeter which is 2*pie*r which comes out to be r*44/7
        float a=r*44/7f;
        System.out.println("Area of Circle :"+a);
    }
}
