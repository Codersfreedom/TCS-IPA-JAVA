import java.util.Arrays;
import java.util.Scanner;

public class smallestVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        char ch[] = new char[0];

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
                        || c == 'O') {

                    ch = Arrays.copyOf(ch, ch.length + 1);
                    ch[ch.length - 1] = c;
                }

            }
        }

        char smallest = 'z';

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] < smallest) {
                smallest = ch[i];
            }
        }

        System.out.println(smallest);

    }
}
