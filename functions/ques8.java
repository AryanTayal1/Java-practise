//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
package functions;
import java.util.Scanner;
public class ques8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Input Marks");
        a=sc.nextInt();
        String grades=grade(a);
        System.out.println(grades);
    }
    static String grade(int a){
        String grades;
        if(100>=a && a>80){
            grades ="A";
        }
        else if(80>=a && a>70){
            grades="B";
        }
        else if(70>=a && a>50){
            grades="C";
        }
        else if(50>=a && a>33){
            grades="D";
        }
        else{
            grades="F";
        }
        return grades;

    }
}
