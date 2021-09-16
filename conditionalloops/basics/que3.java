//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package conditionalloops.basics;
import java.util.Scanner;
public class que3 {
    public static void main(String[] args) {
        int n;
        int x=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer");
       
        while ((n = input.nextInt()) != 0) {
          System.out.print("You entered " + n);
          System.out.print("Input an integer");
          x=x+n;
        }
       
        System.out.println("Out of loop");
        System.out.println("Sum of all integers is:"+x);
      }
}
