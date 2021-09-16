//Take integer inputs till the user enters 0 and print the largest number from all.
package conditionalloops.basics;
import java.util.Scanner;
public class que4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int x=0;
        System.out.print("Input an integer ");
       
        while ((n = sc.nextInt()) != 0) {
          System.out.print("You entered " + n);
          System.out.print("Input an integer ");
          if(n>x){
              x=n;
              continue;
          }
        }
        System.out.println("Out of loop");
        System.out.println("Largest of all integers is:"+x);
        
    }    
}
