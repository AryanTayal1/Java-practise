//Take name as input and print a greeting message for that name.
package intro;
import java.util.Scanner;
public class welcome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your name:");
        String x=sc.nextLine();
        System.out.println("Welcome "+x);
    }
}
