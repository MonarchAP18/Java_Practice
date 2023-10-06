package SeiveAlgorithms;
import java.util.Scanner;

public class SimpleSeive {
    void Seive(int n){
        boolean Prime[] = new boolean[n+1];
        for(int i =0; i<=n; i++){
            Prime[i] = true;
        }
        for( int p = 2 ; p*p <= n; p++){
            if (Prime[p] == true){
                for(int i = p*p; i<n; i +=p)
                    Prime[i]=false;
            }
        }
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        SimpleSeive s = new SimpleSeive();
        s.Seive(n);
    }
}
