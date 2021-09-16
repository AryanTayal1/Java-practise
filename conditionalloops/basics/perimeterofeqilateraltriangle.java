package conditionalloops.basics;
import java.util.Scanner;

public class perimeterofeqilateraltriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Taking input of the side of triangle
        System.out.print("Length of side");
        int a=sc.nextInt();
        //Perimeter of Triangle is 3*side of equilateral triangle
        System.out.println("Perimeter:"+3*a);
    }
}
