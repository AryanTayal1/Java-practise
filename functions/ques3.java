//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package functions;
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Age");
        int age = sc.nextInt();
        String ans=eligibility(age);
        System.out.println("Person is "+ans);
    }
    static String eligibility(int age){
        String ans;
        if (age<18){
            ans="Not eligible to vote";
        }
        else{
            ans="eligible to vote";
        }
        return ans;
    }
}
