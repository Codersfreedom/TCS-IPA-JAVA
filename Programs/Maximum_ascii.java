package Programs;

import java.util.Scanner;

public class Maximum_ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char c = input.charAt(0);

        for(int  i=0;i<input.length();i++){
            if(c < input.charAt(i)){
                c = input.charAt(i);
            }
        }

        System.out.println(c);
    }
}
