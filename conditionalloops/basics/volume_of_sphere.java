package conditionalloops.basics;
import java.util.Scanner;
public class volume_of_sphere {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius:");
        int r = sc.nextInt();
        float v=((88/21f)*r*r*r);
        System.out.println("Volume of Sphere:"+v);
    }
    
}
