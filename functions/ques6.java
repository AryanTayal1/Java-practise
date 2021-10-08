//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package functions;
import java.util.Scanner;
public class ques6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius");
        int r=scanner.nextInt();
        float circumference=circumference(r);
        System.out.println("Circumference of circle is "+circumference);
        float area=area(r);
        System.out.println("Area of circle is "+area);
    }
    static float circumference(int r){
        float ans =44*r/7f;
        return ans;
    }
    static float area(int r){
        float ans =22*r*r/7f;
        return ans;
    }
    
}
