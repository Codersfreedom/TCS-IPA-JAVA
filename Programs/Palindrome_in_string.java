package Programs;

import java.util.Scanner;

public class Palindrome_in_string {

    static boolean isPalindrome(String input) {
        boolean flag = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String arr[] = word.split(" ");

        for (int i = 0; i < arr.length; i++) {
            boolean palindrome = isPalindrome(arr[i]);

            if (palindrome == true) {
                System.out.println(arr[i]);
            }
        }
    }
}
