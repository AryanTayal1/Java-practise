//Write a function that returns the sum of first n natural numbers.
package functions;
import java.util.Scanner;
public class ques14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = scanner.nextInt();
        int ans=sum(n);
        System.out.println("Sum is "+ans);
    }
    static int sum(int n){
        int ans=n*(n+1)/2;
        return ans;
    }

    
}
