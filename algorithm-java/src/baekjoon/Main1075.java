package baekjoon;

import java.util.Scanner;

public class Main1075 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //n을 f로 나눈다.
        long n = scan.nextLong();
        long f = scan.nextLong();

        long n1 = (n / 10) % 10; //십의 자리
        long n2 = n % 10; //일의 자리

//        long nLast = n1 * 10 + n2; // 뒤에 두자리
//        long nFirst = n - nLast;

        //long nLast = n1 * 10 + n2; // 뒤에 두자리
        long nFirst = n - (n1 * 10 + n2);

        String nString = String.valueOf(n);

        //System.out.println(nLast);

        long[] nArray = new long[nString.length()];


        long min = 99;
        long minI = 0;
        long minJ = 0;

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                long newN = nFirst + (i * 10 + j);
                if ( newN >= 100 ) {
                    if (newN % f == 0) {
                        int newNLast = i * 10 + j;
                        if (newNLast <= min) {
                            min = newNLast;
                            minI = i;
                            minJ = j;
                        }
                    }
                }
            }
        }
        System.out.println(minI + "" + minJ);
        //System.out.printf("%02d\n", min);
    }
}
