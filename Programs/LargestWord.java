package Programs;

import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        sc.close();

        String arr[] = word.split(" ");
        int max = Integer.MIN_VALUE;
        String output="";

        for(int i=0;i<arr.length;i++){
            if(arr[i].length() > max){
                max = arr[i].length();
                output = arr[i];
            }
        }

        System.out.println(output);
    }
}
