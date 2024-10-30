package Programs;

import java.util.Scanner;

public class Count_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String arr[] = input.split(" ");

        System.out.println(arr.length);
        
    }
}
