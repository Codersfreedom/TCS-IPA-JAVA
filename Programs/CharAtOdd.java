package Programs;

import java.util.Scanner;

public class CharAtOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        for(int i=0;i<=input.length();i++){
            if(i%2 !=0){
                char c = input.charAt(i);
                System.out.print(c);
            }
        }
    }
}
