package Palindrome;
import java.util.Scanner;

public class PalindromeCode {
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        Scanner S = new Scanner(System.in);
        String Num = S.next();
        //System.out.println(Num);
        int n =  Num.length();
        String B = "";
        for(int i = n-1; i>=0;i--){
             B = B + Num.charAt(i);
        }
        System.out.println("Inverted String is "+ B);
        if(Num.equalsIgnoreCase(B)){
            System.out.println("Palindrome String Found");
        }
        else{
            System.out.println("Invalid Palindrome String");
        }
    }
}
