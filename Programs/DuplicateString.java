package Programs;

// aabbcc 
import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // aabbcc
        
        StringBuilder result = new StringBuilder();

        int count=1; // 2 
        char prevChar = input.charAt(0);  // a 

        for(int i=1;i<input.length();i++){
            char currentChar = input.charAt(i); //a
            if(currentChar == prevChar){
                count++;
            }else{
                result.append(prevChar).append(count); // a2
                prevChar = currentChar;
                count = 1;
            }

        }

        result.append(prevChar).append(count);
        System.out.println(result.toString()); 
    }
}
