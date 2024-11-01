package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int arr[] = new int[0];
        String val = "";
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {

            if (Character.isDigit(input.charAt(i))) {
                val += String.valueOf(input.charAt(i));

            } else if (val != "") {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = Integer.parseInt(val);
                val ="";
            }

        }

        if(val !=""){
            arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = Integer.parseInt(val);
                val ="";
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }

}