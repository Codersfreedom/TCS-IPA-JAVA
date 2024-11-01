package Programs;

import java.util.Scanner;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        char input = sc.nextLine().charAt(0);
        String output = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != input) {
                output += word.charAt(i);
            }
        }

        // Another method
       output = word.replace(String.valueOf(input), "");

        System.out.println(output);
    }
}
