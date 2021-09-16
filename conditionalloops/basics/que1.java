//Subtract the Product and Sum of Digits of an Integer
package conditionalloops.basics;
import java.util.Scanner;
public class que1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input num1:");
        int num1 = sc.nextInt();
        System.out.print("Input num2:");
        int num2 = sc.nextInt();
        int a=(num1*num2)-(num2+num1);
        System.out.print("Answer:"+a);
    }
    
}
