package Programs;

import java.util.Scanner;

public class EvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        int n = Integer.parseInt(num);
        int sum=0;
        while(n>0){
            int rem = n%10;

            if(rem%2==0){
                sum += rem;
            }
            n = n/10;
        }
        System.out.println(sum);
    }
}
