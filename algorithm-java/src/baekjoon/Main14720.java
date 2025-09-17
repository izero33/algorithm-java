package baekjoon;

import java.util.Scanner;

public class Main14720 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[] milk = new int[a];
        int cnt = 0;
        int next = 0;

        for (int i = 0; i < a; i++) {
            milk[i] = scan.nextInt();
        }

        for (int i = 0; i < a; i++) {

            System.out.println("cnt" + cnt + "/next:" + next);

            if (milk[i] == next) {

                cnt++;

                next = (next + 1) % 3;
            }
        }
        System.out.println(cnt);
    }
}
