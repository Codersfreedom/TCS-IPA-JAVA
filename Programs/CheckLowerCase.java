package Programs;

import java.util.Scanner;

public class CheckLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int count=0;

        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);

            if(Character.isLowerCase(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
