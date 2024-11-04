import java.util.Scanner;

public class printOddpositionChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        for(int i=1;i<=word.length();i++){
            if(i%2 !=0)
            {
                System.out.print(word.charAt(i-1));
            }
        }
    }
}
