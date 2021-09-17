package conditionalloops.Intermediate_Java_Programs;
import java.util.Scanner;
import java.lang.Math;
public class Distance_Between_Two_Points {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the coordinates of point 1:\n");
        System.out.print("x1:");
        int x1 = sc.nextInt();
        System.out.print("y1:");
        int y1 = sc.nextInt();
        System.out.print("Input the coordinates of point 2:\n");
        System.out.print("x2:");
        int x2 = sc.nextInt();
        System.out.print("y2:");
        int y2 = sc.nextInt();
        double d=((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double d2;
        d2 = Math.sqrt(d);
        System.out.println("Distance between two points is:"+d2);

    }
}
