package Programs;

// Write main method in Solution class. In the main method, read five values for an integer array and two int value which arethe limits (limit1 and limit2). The main method should print the average of integer values which are greater than limit1 and lessthan limit2. For example if the values are 1,2,3,4,5 and the limits are 2 and 6 then the average is 4((3+4+5)/3). The output should be in theformat of sample output.

import java.util.Scanner;

/**
 * Average_in_range
 */
public class Average_in_range {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();

        }

        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();

        int sum=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] >limit1 && arr[i] <limit2){
                sum+=arr[i];
                count++;
            }
        }

        System.out.println("Average: "+sum/count);
    }
}