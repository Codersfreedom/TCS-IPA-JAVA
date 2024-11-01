package Programs;

import java.util.Scanner;

public class Same_1st_2nd_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String arr[] = word.split(" ");
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (String.valueOf(arr[i].charAt(0)).equalsIgnoreCase(String.valueOf(arr[i].charAt(arr[i].length() - 1)))) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No duplicate found");
        }

    }

}
