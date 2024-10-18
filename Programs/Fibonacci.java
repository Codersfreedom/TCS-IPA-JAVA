package Programs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i=0;
        int k=1;

        System.out.println(i);

        while(k<n){
            System.out.println(k);
            int p = k;
            k= k+i;
            i= p;
        }
    }
}
