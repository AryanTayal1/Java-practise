//Define a method to find out if a number is prime or not.
package functions;
import java.util.Scanner;
public class ques7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = scanner.nextInt();
        boolean ans=primeornot( num);
        System.out.print(ans);

    }
    static boolean primeornot(int num){
        
        if(num<=1){
           return false;
        }
        else if(num==2){
            return true;
        }
        else if(num%2==0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2)
        {
            if (num % i == 0)
                return false;
        }
        
        return true;
    }
}
