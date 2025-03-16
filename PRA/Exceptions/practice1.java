package Exceptions;

public class practice1 {
    public static void main(String[] args) {
        int arr[] = new int[5];

        try {
            arr[10] = 4;
            arr[4] = 1 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Run complete");
    }
}
