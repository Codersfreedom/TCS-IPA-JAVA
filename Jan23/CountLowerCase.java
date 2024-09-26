package Jan23;

import java.util.Scanner;


public class CountLowerCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count=0;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);

            if(c >='a' && c <='z'){
                count++;
            }
        }
        if(count ==0){
            System.out.println("No lower case found");
        }else{

            System.out.println(count);
        }
    }
}
