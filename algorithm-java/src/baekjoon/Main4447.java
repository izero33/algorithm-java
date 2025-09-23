package baekjoon;

import java.util.Scanner;
/*
!!개행 제거!!
scan.nextLine();

!!문자열 비교!!
대소문자 통일 시키기
* */
public class Main4447 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.nextLine(); // 개행제거
        String[] name = new String[num];

        for (int i = 0; i < num; i++) {
            name[i] = scan.nextLine();
        }

        int bCount;
        int gCount;

        for (String s : name) {
            if (s == null) continue;
            bCount = 0;
            gCount = 0;

            String sLower = s.toLowerCase();

            for (int j = 0; j < sLower.length(); j++) {

                if (sLower.charAt(j) == 'b') {
                    bCount++;
                } else if (sLower.charAt(j) == 'g') {
                    gCount++;
                }
            }
            if (bCount > gCount) {
                System.out.printf("%s is A BADDY%n", s);
            } else if (bCount < gCount) {
                System.out.printf("%s is GOOD%n", s);
            } else {
                System.out.printf("%s is NEUTRAL%n", s);
            }


        }


    }
}
