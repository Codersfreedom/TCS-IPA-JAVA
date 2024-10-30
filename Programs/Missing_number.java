package Programs;

import java.util.Scanner;

public class Missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lengthe of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 1;
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] != arr[j] && (arr[j] - arr[i]) != 1) {
                int element=arr[i];
                while (element < arr[j] && ( arr[j]-element) !=1) {
                    element++;
                    System.out.println(element);
                    
                }
            }
            j++;
        }

    }

}
