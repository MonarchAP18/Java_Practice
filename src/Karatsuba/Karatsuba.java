package Karatsuba;

import java.util.Scanner;
import java.math.*;


public class Karatsuba {
    public static void main (String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int A = S.nextInt();
        System.out.println("Enter the number 2:");
        int B = S.nextInt();
        int AD = Integer.parseInt(String.valueOf(A), 2);
        int BD = Integer.parseInt(String.valueOf(B),2);
        int C = AD * BD;
        String CB =  Integer.toBinaryString(C);
        System.out.println("Number One is : "+AD);
        System.out.println("Number Two is : "+BD);
        System.out.println(("Multiplication is :"+ C));
        System.out.println("Output is : "+ CB);

    }
}
