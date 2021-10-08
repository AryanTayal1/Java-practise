//Write a program to print the sum of two numbers entered by user by defining your own method.
package functions;
import java.util.Scanner;

public class ques4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num1");
        int a=sc.nextInt();
        System.out.println("Input num1");
        int b=sc.nextInt();
        int ans=sum(a,b);
        System.out.println("Sum of num1 nd num2 is "+ans);
    }
    static int sum(int a, int b){
        int sum=a+b;
        return sum;
    }
    
}
