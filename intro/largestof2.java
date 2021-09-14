//Take 2 numbers as input and print the largest number.
package intro;
import java.util.Scanner;

public class largestof2 {
    public static void main(String srgs[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input Number1 ");
        int a=sc.nextInt();
        System.out.print("Input Number2 ");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("Num 1 is largest");
        }
        else{
            System.out.println("Num 2 is largest");
        }
    }
}
