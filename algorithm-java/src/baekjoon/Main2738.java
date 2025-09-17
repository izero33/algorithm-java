package baekjoon;

import java.util.Scanner;

public class Main2738 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int[][] arr1 = new int[x][y];
        int[][] arr2 = new int[x][y];
        int[][] arr3 = new int[x][y];

        for (int i = 0;i<x;i++){
            for (int j = 0;j<y;j++){
                arr1[i][j] = scan.nextInt();
            }
        }
        for (int i = 0;i<x;i++){
            for (int j = 0;j<y;j++){
                arr2[i][j] = scan.nextInt();
            }
        }

        for (int i = 0;i<x;i++){
            for (int j = 0;j<y;j++){
                arr3[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
