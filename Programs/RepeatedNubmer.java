 package Programs;

import java.util.Scanner;

class RepeatedNubmer {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String word = sc.nextLine();

            for(int i = 0;i<word.length();i++){

                if( Character.isAlphabetic(word.charAt(i))  ){
                    System.out.print(word.charAt(i));
                }

                if(Character.isDigit(word.charAt(i))){
                    for(int j=1;j<Integer.parseInt(String.valueOf(word.charAt(i)));j++){
                        System.out.print(word.charAt(i-1));
                    }
                }
            }
    }
}