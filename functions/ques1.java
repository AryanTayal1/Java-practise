//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package functions;
import java.util.Scanner;
public class ques1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n",a, b, c, maximum);
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n",a, b, c, minimum);
}
public static int maximum(int a, int b, int c){
    int max=a;
    if(b>max){
        max=b;
    }
    if(c>max){
        max=c;
    }   
    return max;
}
public static int minimum(int a, int b, int c){
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
