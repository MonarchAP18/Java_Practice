package BasicOperators;
import  java.util.Scanner;
public class PrimeNumbers {
    static boolean Prime(int n){

        if(n <=1) {
            return false;
        }
        for( int i =  2; i < n; i++ ){
            if(n % i == 0){
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = S.nextInt();
        System.out.println(Prime(n));
    }
}
