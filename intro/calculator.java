//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package intro;
import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1:");
        int a=sc.nextInt();
        System.out.print("Enter number2:");
        int b=sc.nextInt();
        System.out.print("Enter the operator(+,-,*,/):");
        String x=sc.next();
        char c=x.charAt(0);
        if(c=='+'){
            System.out.print("Result:"+(a+b));
        }
        else if(c=='-'){
            System.out.print("Result:"+(a-b));
        }
        else if(c=='*'){
            System.out.print("Result:"+(a*b));
        }
        else if(c=='/' && b!=0){
            System.out.print("Result:"+(a/b));
        }
        else{
            System.out.print("Invalid Input");
        }

    }
    
}
