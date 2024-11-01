package Programs;

import java.util.Scanner;

public class PrintUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().toLowerCase();
        String str = "";

        for (int i = 0; i < input.length(); i++) {
            if (!str.contains(Character.toString(input.charAt(i)))) {
                str += input.charAt(i);
            }
        }

        System.out.println(str);

    }
}
