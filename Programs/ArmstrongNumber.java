package Programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        String input = String.valueOf(num);

        for (int i = 0; i < input.length(); i++) {

            sum += Math.pow(Integer.parseInt(String.valueOf(input.charAt(i))), 3);

        }

        if (sum == num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }

    }
}
