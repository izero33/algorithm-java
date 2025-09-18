package baekjoon;

import java.util.Scanner;
public class Main12927 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String switches = scan.next();
        StringBuilder sb = new StringBuilder(switches);
        int n = sb.length();

        int count = 0;
        for (int i = 1; i <= n; i++) {

            char c = sb.charAt(i-1);

                if (c == 'Y') {
                    count++;
                    for (int k = i; k <= n; k+=i) { //i의 배수만...
                        sb.setCharAt(k-1, (sb.charAt(k-1) == 'Y') ? 'N' : 'Y');
                        System.out.println(count+":"+sb);
                        //sb.setCharAt(i*k, (sb.charAt(i) == 'N') ? 'Y' : 'N');
                    }
                }


        }
        System.out.println(count);
    }
}
