package baekjoon;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        int aScore = 100;
        int bScore = 100;

        for (int i = 0; i < t; i++) {
            String[] tmp = scan.nextLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            if(a > b) {
                bScore -= a;
            } else {
                aScore -= b;
            }
        }

        System.out.println(aScore);
        System.out.println(bScore);
    }
}
