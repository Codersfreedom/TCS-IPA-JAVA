package Programs;

import java.util.Scanner;

public class LastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String arr[] = word.split(" ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i].charAt(arr[i].length()-1));
        }
        
    }
}
