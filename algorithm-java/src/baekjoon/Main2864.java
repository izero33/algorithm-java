package baekjoon;

import java.util.Scanner;

public class Main2864 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        int minA = Integer.parseInt(a.replace("6","5"));
        int minB = Integer.parseInt(b.replace("6","5"));

        int maxA = Integer.parseInt(a.replace("5","6"));
        int maxB = Integer.parseInt(b.replace("5","6"));

        int min = (int)minA + (int)minB;
        int max = (int)maxA + (int)maxB;

        System.out.println(min);
        System.out.println(max);
    }
}
