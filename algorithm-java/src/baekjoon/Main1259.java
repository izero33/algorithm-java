package baekjoon;

import java.util.Scanner;

public class Main1259 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {

            String a = scan.next();
            int len = a.length();

            if (a.equals("0")) break;

            int j = 0;
            for (j = 0; j < len / 2; j++) {
                if (a.charAt(j) != a.charAt(len - j - 1)) {
                    System.out.println("no");
                    break;
                }
            }
            if(j==len/2){
                System.out.println("yes");
            }
        }
    }
}
