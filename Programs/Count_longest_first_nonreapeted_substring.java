package Programs;

import java.util.Scanner;

public class Count_longest_first_nonreapeted_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Arijit

        String input = sc.nextLine();
        int count=0;
        String s = " ";

        for(int i =0; i<input.length();i++){
            for(int j=0;j<=i;j++){
                if(i==j){
                    s = s+input.charAt(i);

                }else{
                    if(input.charAt(i) == input.charAt(j)){
                        count++;
                        break;
                    }
                }
            }
            if(count > 0){
                break;
            }


        }
        System.out.println(s);
    }
}
