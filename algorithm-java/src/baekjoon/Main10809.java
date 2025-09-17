package baekjoon;

import java.util.Scanner;

public class Main10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        char[] s = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            s[i] = word.charAt(i);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean ab = false;
            //System.out.println(ch);
            for (int i = 0; i < word.length(); i++) {
                if (s[i] == ch) {
                    System.out.print(i + " ");
                    ab = true;
                    break;
                }
            }
            if (!ab) {
                System.out.print("-1 ");
            }
        }
    }
}
