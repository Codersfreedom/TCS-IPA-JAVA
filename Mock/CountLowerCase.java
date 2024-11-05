import java.util.Scanner;

public class CountLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int count=0;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                count++;
            }
        }

        if(count>0){
            System.out.println(count);
        }else{
            System.out.println("No lower case character present");
        }
    }
}
