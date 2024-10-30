package Programs;

import java.util.Scanner;

public class ReverseOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Number can't reverse");
        } else {
            for (int i = String.valueOf(n).length()-1; i >= 0; i--) {
                System.out.print(String.valueOf(n).charAt(i));
            }
        }
    }
}
