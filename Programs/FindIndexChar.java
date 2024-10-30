package Programs;

import java.util.Scanner;

public class FindIndexChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char search_char = sc.nextLine().charAt(0);
        sc.close();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == search_char) {
                System.out.println(i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("NA");
        }
    }
}
