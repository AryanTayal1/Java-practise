//Define a program to find out whether a given number is even or odd.
package functions;
import java.util.Scanner;
public class ques2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input NUmber:");
        int num = scanner.nextInt();
        String ans=evenorodd(num);
        System.out.println("Number is "+ans);
    }
    static String evenorodd(int num) {
        int r=num%2;
        String ans;
        if(r==0){
            ans="even";
        }
        else{
            ans="odd";
        }
        return ans;
        
    }
    
}
