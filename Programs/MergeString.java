package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class MergeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        String s1[] = input1.split(",");
        String s2[] = input2.split(",");

        for (int i = 0; i < s2.length; i++) {
            s1 = Arrays.copyOf(s1, s1.length + 1);
            s1[s1.length - 1] = s2[i];

        }

        String n = Arrays.toString(s1);

        String k = n.substring(1, n.length() - 1);
        System.out.println(k);

    }
}
