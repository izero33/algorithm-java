package baekjoon;

import java.util.Scanner;

public class Main1789 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long s = scan.nextLong();
        long n = 0;
        long sum = 0;

        for (long i = 1; ; i++) {
            sum = sum + i;

            n++;
            if (sum > s) {
                System.out.println(n-1);
                break;
            } else if (sum == s) {
                System.out.println(n);
                break;
            }
        }
    }
}
