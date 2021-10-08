//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package functions;
import java.util.Scanner;
public class ques1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int maximum=maximum(a,b,c);
        int minimum=minimum(a,b,c);
        System.out.printf("largest of three is ", +maximum);
        System.out.printf("smallest of three numbers is", +minimum);
    }
    static int maximum(int a, int b, int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }   
        return max;
    }
    static int minimum(int a, int b, int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }   
        return min;
    }

}


