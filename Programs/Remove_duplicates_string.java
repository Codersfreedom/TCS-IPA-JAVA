package Programs;

import java.util.Scanner;

public class Remove_duplicates_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String output="";
        char ch = '\0'; // a

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != ch){
                ch = word.charAt(i);
                output += ch;
            }
        }
        System.out.println(output);
    }
}
