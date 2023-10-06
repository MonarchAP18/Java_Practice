package SeiveAlgorithms;

import java.util.Scanner;

public class SeiveTry1 {
    public static void main(String[]args){
        Scanner S = new Scanner(System.in);
        int N = S.nextInt();
        boolean Prime[] = new boolean[N+1];
        for(int i = 0; i < N+1;i++){
            Prime[i] = true;
        }

        for(int i = 0; i<N; i++){
            if(Prime[i] == true){
                for(int j = i*i;j<N; j = j+i  ){
                    Prime[j] = false;

                }
            }
        }
    }
}
