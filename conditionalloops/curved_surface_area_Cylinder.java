package conditionalloops;
import java.util.Scanner;
public class curved_surface_area_Cylinder {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Radius:");
        int r = s.nextInt();
        System.out.print("Height:");
        int h = s.nextInt();
        float v=((44/7f)*r*h);
        System.out.println("Curved Surface Area of Cylinder:"+v);
    }
    
}
