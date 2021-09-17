package conditionalloops.Intermediate_Java_Programs;
import java.util.Scanner;
public class Calculate_CGPA {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("No.of subjects:");
        int n=sc.nextInt();
        int j=0;
        for (int i =0;i<=n;i++){
            System.out.print("Input marks out of 10:");
            int d=sc.nextInt();
            j=j+d;
        }
        double b=j/n;
        System.out.println("CGPA:"+b);
    }
    
}
