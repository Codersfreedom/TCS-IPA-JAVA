package Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        sc.close();
        LinkedHashMap<Character, Integer> output = new LinkedHashMap<>();

     
        for (int i = 0; i < word.length(); i++) {
            if(!output.containsKey(word.charAt(i))){
                output.put(word.charAt(i), 1);
            }else{
                output.put(word.charAt(i), output.get(word.charAt(i))+1);
            }
        }
        for (HashMap.Entry<Character, Integer> data : output.entrySet()) {
            System.out.println(data.getKey() + ":" + data.getValue());
        }
    }
}
