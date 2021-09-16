package conditionalloops.Intermediate_Java_Programs;
import java.util.Scanner;
public class Calculate_Discount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the M.R.P of product:");
        int amount = sc.nextInt();
        System.out.print("Enter the the discount %:");
        int discount = sc.nextInt();
        float a=amount*discount/100f;
        System.out.println("Final Amount of product:"+(amount-a));
        System.out.println("Discount amount:"+a);

    }

    
}
