/* Count number of vowel, consonent and digit into a string */

package Programs;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int v = 0;
        int cn = 0;
        int d = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
                        || c == 'O') {
                    v++;
                } else {
                    cn++;
                }
            } else if (Character.isDigit(c)) {
                d++;
            }
        }
        
        System.out.println(v);
        System.out.println(cn);
        System.out.println(d);
    }
}
