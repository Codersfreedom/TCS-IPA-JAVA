package Programs;

import java.util.Scanner;

public class sum_prime_digits {

    public static boolean isPrime(int num) {
        boolean flag = false;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int sum =0;

        for(int i=0;i<input.length();i++){
            int currNum = Integer.parseInt(String.valueOf(input.charAt(i)));
            if(isPrime(currNum)){
                sum += currNum;
            }
        }

        System.out.println(sum);
    }

}
