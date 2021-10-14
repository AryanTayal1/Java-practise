//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
package functions;
import java.util.Scanner;
public class ques9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int ans=factorial(n);
        System.out.println(ans);

    }
    static int factorial(int n) {
        int ans=1;
        for (int i = 1; i <=n; i++){
            ans=ans*i;
        }
        return ans;
    }
}
