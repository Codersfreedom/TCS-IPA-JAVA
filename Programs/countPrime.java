/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
package Programs;

import java.util.Scanner;

public class countPrime {

    static boolean checkIsPrime(int n) {

        int count = 0;
        for (int j = 1; j <= n; j++) {

            if (n % j == 0) {
                count++;

            }

        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        String number = String.valueOf(n);

        for (int i = 0; i < number.length(); i++) {
            int currValue = Integer.parseInt(String.valueOf(number.charAt(i)));

            if (checkIsPrime(currValue) == true) {
                count++;
            }

        }
        System.out.println(count);
    }
}
