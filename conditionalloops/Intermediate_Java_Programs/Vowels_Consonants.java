package conditionalloops.Intermediate_Java_Programs;
import java.util.Scanner;
public class Vowels_Consonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String: ");
        String a=sc.nextLine();
        int v=0,c=0;
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++) {
            char ch=a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                v++;
            }
            else if((ch>='a'&&ch<='z')){
                c++;
            }
        }
        System.out.println("number of Vowels:" +v);
        System.out.println("number of Consonants:" +c);

    }
    
}
