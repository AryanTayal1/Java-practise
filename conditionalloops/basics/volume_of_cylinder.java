package conditionalloops.basics;
import java.util.Scanner;
public class volume_of_cylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius:");
        int r = sc.nextInt();
        System.out.print("Height:");
        int h = sc.nextInt();
        float v=((22/7f)*r*r*h);
        System.out.print("Volume of Cylinder:"+v);
    }
}
