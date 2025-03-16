package Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new LinkedHashSet<String>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add(null);

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.add(1, "Lemon");
        list.remove(2);

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list);
        for (String s : set) {
            System.out.println(s);
        }

        String word = "hello";
        System.out.println(word.contains("h"));

        for(int i=0;i<5;i++){
            System.out.println(i);
            if(i==3){
                break;
            }
        }
    }
}
