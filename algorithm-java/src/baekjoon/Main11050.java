package baekjoon;

import java.util.Scanner;

public class Main11050 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int n_k = n-k;


        int nFac = 1;
        int kFac = 1;
        int n_kFac = 1;

        for (int i = n; i>0 ;i--){
            nFac = nFac*i;
        }

        for (int i = k; i>0 ;i--){
            kFac = kFac*i;
        }

        for (int i = n_k; i>0 ;i--){
            n_kFac = n_kFac*i;
        }

        int nCk = nFac / (n_kFac*kFac);
        System.out.println(nCk);

    }
}
