package baekjoon;

import java.util.Scanner;

public class Main10988 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        char[] wordArray = word.toCharArray();
        boolean isSame = true;


        for (int i = 0; i< wordArray.length/2; i++){

            if (wordArray[i] != wordArray[wordArray.length-i-1]){
                isSame = false;
                if (i == wordArray.length-i-1){
                    break;
                }
            }
        }

        if (isSame){
            System.out.println(1);
        }else{
            System.out.println(0);
        }



    }
}
