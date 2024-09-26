package Apr22;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String word[] = input.split(" ");
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            char c = word[i].charAt(0);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No words found");
        }
    }
}
