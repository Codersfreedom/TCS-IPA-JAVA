package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Larges_Smallest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers you want to take input?");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++){
            System.out.println("Enter Number "+(i+1));
            arr[i] = sc.nextInt();

        }
        sc.close();
        // Arrays.sort(arr);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Smallest number is: "+arr[0]);
        System.out.println("Largest number is: "+arr[n-1]);
    }
}
