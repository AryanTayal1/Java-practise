package conditionalloops.basics;
import java.util.Scanner;
public class perimeterofrhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Side: ");
        int x=sc.nextInt();
        System.out.println("Perimeter of rhombus:"+4*x);
    }
}
