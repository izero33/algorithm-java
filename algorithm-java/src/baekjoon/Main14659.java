package baekjoon;

import java.util.Scanner;

public class Main14659 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] b = new int[n];
        int[] countArray = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }

        int count;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i+1; j < n; j++) {
                if (b[i] > b[j]) {
                    count++;
                }else {
                    break;
                }
            }
            countArray[i] = count;
        }
//        for (int i = 0; i< n;i++){
//            System.out.println(countArray[i]);
//        }

        int max=0;
        for (int i = 0; i< n ; i++){
            if (max < countArray[i]){
                max = countArray[i];
            }
        }
        System.out.println(max);
    }
}
