import java.util.Scanner;

public class MyClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();
        String value = String.valueOf(num);
        int count=0;

        for(int i=0;i<value.length();i++){
            char c = value.charAt(i);

            if( (int)c %2 != 0 ){
                count ++;
            }
        }


        System.out.println(count);
    }
}