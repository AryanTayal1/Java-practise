package conditionalloops;
import java.util.Scanner;
public class volume_of_pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Base Length:");
        int b=sc.nextInt();
        System.out.print("Base Width:");
        int w=sc.nextInt();
        System.out.print("Height:");
        int h=sc.nextInt();
        float v=(b*w*h/3f);
        System.out.print("Volume of Pyramid:"+v);
    }
    
}
