package A2OJ;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] rgs) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();


        if(k<=(n+1)/2) {
            System.out.println(k*2-1);
        }
        else{
            System.out.println((k-(n+1)/2)*2);
        }
    }
}
