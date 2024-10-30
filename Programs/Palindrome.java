package Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        boolean flag = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
