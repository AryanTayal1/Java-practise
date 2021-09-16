package conditionalloops;
import java.util.Scanner;
public class areaofequilateraltriangle {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side:");
        int a=sc.nextInt();
        float b= (a*a*1.74f/4);
        System.out.println("Area:"+b);
    }
        
}