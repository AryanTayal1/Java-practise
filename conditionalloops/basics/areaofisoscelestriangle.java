package conditionalloops.basics;
import java.util.Scanner;
import java.lang.*;
public class areaofisoscelestriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the common side:");
        int a=sc.nextInt();
        System.out.println("Input the third side:");
        int b=sc.nextInt();
        float s=((a+a+b)/2);
        float c=s*(s-b);
        double x=Math.sqrt(c);
        double y=(s-a)*x;
        System.out.print("Area Of Isosceles Triangle is:" +y);
    }

}