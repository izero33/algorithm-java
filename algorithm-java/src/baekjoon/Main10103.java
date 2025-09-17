package baekjoon;

import java.util.Scanner;

public class Main10103 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int round = scan.nextInt();
        int[] game = new int[round * 2];
        int ch = 100;
        int sa = 100;

        for (int i = 0; i < round * 2; i++) {
            game[i] = scan.nextInt();
        }

//        for (int i = 0; i < round*2; i++) {
//            System.out.println(game[i]);;
//        }

        for (int i = 0; i < round * 2; i = i + 2) {

            int chGame = game[i];
            int saGame = game[i+1];

            if (chGame < saGame){
                ch = ch - saGame;
                //System.out.println(ch);
            } else if (chGame > saGame) {
                sa = sa -chGame;
                //System.out.println(sa);
            } else if (chGame == saGame) {
                sa = sa - 0 ;
                ch = ch - 0 ;
            }

        }


        System.out.println(ch);
        System.out.println(sa);
    }
}
