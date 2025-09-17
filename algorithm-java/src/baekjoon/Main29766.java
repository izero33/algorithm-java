package baekjoon;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main29766 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        Pattern p = Pattern.compile("DKSH");
        Matcher m = p.matcher(word);

        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println(count);

    }
}
