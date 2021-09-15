package conditionalloops;
import java.util.Scanner;
public class TSA_of_cube {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Side:");
        int a=sc.nextInt();
        System.out.print("Total Surface Area of Cube:"+6*a*a);
    }
}
