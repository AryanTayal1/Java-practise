//Define a method that returns the product of two numbers entered by user.
package functions;
import java.util.Scanner;

public class ques5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input num1");
        int a=scanner.nextInt();
        System.out.println("Input num1");
        int b=scanner.nextInt();
        int ans=product(a,b);
        System.out.println("Sum of num1 nd num2 is "+ans);
    }
    static int product(int a, int b){
        int product =a*b;
        return product;
    }
    
}
