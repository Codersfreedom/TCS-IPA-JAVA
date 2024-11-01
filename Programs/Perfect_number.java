package Programs;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = n;
        while (i > 1) {
            int remender = n % i;

            if (remender == 0) {
                sum = sum + (n / i);

            }
            i--;
        }

        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a perfect number");
        }
    }
}
