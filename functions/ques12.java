//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

package functions;
import java.util.Scanner;
public class ques12 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input num1:");
        int num1=sc.nextInt();
        System.out.println("Input num2:");
        int num2=sc.nextInt();
        System.out.println("Input num3");
        int num3=sc.nextInt();
        String answer=pythagorean(num1,num2,num3);
        System.out.println("Values are "+answer);
    }
    static String pythagorean(int num1, int num2,int num3) {
        String ans;
        if(num1*num1==(num2*num2)+(num3*num3)){
            ans="Pythagorean";
        }
        else if(num2*num2==(num1*num1)+(num3*num3)){
            ans="Pythagorean";
        }
        else if(num3*num3==(num2*num2)+(num1*num1)){
            ans="Pythagorean";
        }
        else{
            ans="Not Pythagorean";
        }

        return ans;

    }
}
