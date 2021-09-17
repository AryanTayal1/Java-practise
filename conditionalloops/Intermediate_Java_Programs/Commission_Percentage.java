package conditionalloops.Intermediate_Java_Programs;
import java.util.Scanner;
public class Commission_Percentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the amount:");
        int amount = sc.nextInt();
        System.out.print("Commission Amount:");
        int commission=sc.nextInt();
        float cp=commission*100f/amount;
        System.out.println("Commission Percentage:"+cp+"%");
    }
    
}
