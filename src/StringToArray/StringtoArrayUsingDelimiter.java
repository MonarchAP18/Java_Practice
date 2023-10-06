package StringToArray;

import java.util.Scanner;

public class StringtoArrayUsingDelimiter {
    public static void main(String []args){
        Scanner S = new Scanner(System.in);
        String Input  = S.nextLine();
        //char Int[] = Input.toCharArray();
        String Int[] = Input.split(",");
        //int IntArray = Integer.parseInt(String.valueOf(Int));
        for(int i = 0; i< Int.length; i++){
            System.out.print(Int[i]+" ");
        }
    }
}
