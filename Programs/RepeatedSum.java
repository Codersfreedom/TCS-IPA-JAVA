package Programs;

import java.util.Scanner;

public class RepeatedSum {
    public static int sum(int n) {
        int div = n;
        int sum = 0;

        while (div > 0) {
            int rem = div % 10;
            sum += rem;
            div = div / 10;

            
        }
        if (sum > 9) {
                return sum(sum);
            }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();
        if (num <= 9) {
            System.out.println(num);
        } else {
            int sum = sum(num);
            System.out.println(sum);
        }

    }
}
