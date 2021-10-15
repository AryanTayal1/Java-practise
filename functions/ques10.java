//Write a function to find if a number is a palindrome or not. Take number as parameter.
package functions;
import java.util.Scanner;

public class ques10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        String ans=palindrome(n);
        System.out.println(ans);
    }
    static String palindrome(int n){
        int temp,sum=0,r;
        String ans;
        temp=n;    
        while(n>0){    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
        }    
        if(temp==sum)    
        ans="Palindrome number ";    
        else    
        ans="Not Palindrome number";    

        return ans;

    }
    
}
