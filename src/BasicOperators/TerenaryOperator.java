package BasicOperators;
import java.util.Scanner;
import java.math.*;
public class TerenaryOperator {
    public static void main(String[] args){
        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min);
        a = 10;
        b = 5;
        min = (a < b) ? a : b;
        System.out.println(min);
        a = 15;
        b = 23;
        min = (a > b) ? a : b;
        System.out.println(min);

    }
}
