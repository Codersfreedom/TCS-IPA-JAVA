/*Write a main method that sould read five integer array values. The main method should print the sum of odd numbers from the array of integers only if the sum value is greater than 8 and lessthan 50. Else it should print "NA". For example, if the values are 1,2,3,5,7 the sum of odd numbers should be printed as 16. As in the array, 1,3,5,7 areodd numbers so their sum is 16(1+3+5+7) which is greater than 8 and less than 50. The output should be in the formatof sample output.  
Note: Sum of integers is based on their sign(+ or -) Example: If two numbers are 11 and -18, their sum will be -7. */

import java.util.Scanner;

public class SumofOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 !=0){
                sum+=arr[i];
            }
        }

        if(sum >8 && sum <50){
            System.out.println("Sum of odd is: "+sum);
        }else{
            System.out.println("NA");
        }
    }
}
