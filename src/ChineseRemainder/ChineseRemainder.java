package ChineseRemainder;

public class ChineseRemainder {
    public static void main(String[] args) {
        int n = 10000;
        for(int i = 1; i < n ; i++) {
            if(i % 9 == 3 && i % 13 == 7 && i % 19 == 18){
                System.out.println(i);
                break;
            }

        }
    }
}
