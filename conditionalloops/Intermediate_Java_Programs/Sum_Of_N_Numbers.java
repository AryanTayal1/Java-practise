package conditionalloops.Intermediate_Java_Programs;
import java.util.Scanner;
public class Sum_Of_N_Numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of numbers:");
        int n=sc.nextInt();
        int j=0;
        for (int i=0;i<=n;i++){
            System.out.print("Input number:");
            int d=sc.nextInt();
            j=j+d;
        }
        System.out.println("Sum:"+j);
    }
}
