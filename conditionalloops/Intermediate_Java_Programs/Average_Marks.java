package conditionalloops.Intermediate_Java_Programs;
import java.util.Scanner;
public class Average_Marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input no. of students:");
        int a=sc.nextInt();
        int b=0;
        for (int i=0; i<a; i++) {
            int n=sc.nextInt();
            b=b+n;
        }
        System.out.println("Average Marks:"+b/a);
    }
}
