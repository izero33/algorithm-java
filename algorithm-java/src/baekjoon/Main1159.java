package baekjoon;

import java.util.*;

public class Main1159 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        String[] names = new String[a];

        int[] cnt = new int[26];

        for (int i = 0; i < a; i++) {
            names[i] = scan.next();
        }

        //int num = 0;
        for (int i = 0; i < a; i++) {
            String name = names[i];
            char first = name.charAt(0);
            int index = first - 'a';
            cnt[index]++;

            }

        List<Character> list = new ArrayList<>();

        for (int j= 0; j<26;j++){
            if (cnt[j] >= 5){
                list.add((char)('a'+j));
            }
        }

        if (list.isEmpty()){
            System.out.println("PREDAJA");
        }else {
            for(char item : list){
                System.out.print(item);
            }
        }

    }
}
