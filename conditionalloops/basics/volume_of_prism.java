package conditionalloops;
import java.util.Scanner;
public class volume_of_prism {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Area of base:");
        int b=sc.nextInt();
        System.out.print("Height:");
        int h=sc.nextInt();
        System.out.println("Volume of Prism is:"+b*h);
    }
    
}
