import java.util.Scanner;

public class CountStartWithVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String str[] = word.split(" ");
        int count=0;


        for(int i=0;i<str.length;i++){
            char c = str[i].charAt(0);

            if(c=='a' || c=='e'|| c=='i'||c=='o'||c=='u'|| c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count++;
            }
        }

        if(count==0){
            System.out.println("No String found");
        }else{
            System.out.println(count);
        }
    }
}
