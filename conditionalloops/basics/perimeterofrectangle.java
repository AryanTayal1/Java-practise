package conditionalloops.basics;
import java.util.Scanner;
public class perimeterofrectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Breath:");
        int a=sc.nextInt();
        System.out.print("Length:");
        int b=sc.nextInt();
        System.out.println("Perimeter:"+(2*(a+b)));
    }
    
}
