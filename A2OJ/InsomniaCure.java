package A2OJ;

import java.util.Scanner;

public class InsomniaCure {
    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        int l = scan.nextInt();
        int d = scan.nextInt();
        int count = 0;
        for (int i=0; i<=d; i++) {
            if(i%k!=0 && i%m!=0 && i%n!=0 && i%l!=0){
                count++;
            }
        }
        System.out.println(d-count);
    }
}
