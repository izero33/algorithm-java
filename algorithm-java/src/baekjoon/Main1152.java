package baekjoon;

import java.util.Scanner;

public class Main1152 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine().trim();

        if (a.isEmpty()) {
            System.out.println(0);
        } else {
            String[] word = a.split("\\s+");
            System.out.println(word.length);
        }
    }
}
