//Input currency in rupees and output in USD.
package intro;
import java.util.Scanner;

public class inrtousd {
    public static void main(String srgs[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter in Ruppes:");
        int x=sc.nextInt();
        System.out.print("Amount in USD is "+(x*73.71));
        
    }
}
