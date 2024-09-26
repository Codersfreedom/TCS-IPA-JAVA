package IPA13;

import java.util.Scanner;

class AutonomousCar {
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String env;

    AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String env) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed=noOfTestsPassed;
        this.env = env;
    }

    int getNoOfTestPassed() {
        return noOfTestsPassed;
    }

    int getNoOfTestConducted() {
        return noOfTestsConducted;
    }

    String getBrand() {
        return brand;
    }

    String getEnv() {
        return env;
    }

}

public class Solution {

    static int findTestPassedByEnv(AutonomousCar a[], String env) {

        int sum = 0;

        for (AutonomousCar auto : a) {
            if (auto.getEnv().equalsIgnoreCase(env)) {
                sum += auto.getNoOfTestPassed();
            }
        }

        if (sum > 0) {
            return sum;
        } else {
            return 0;
        }

    }

    static AutonomousCar updateCarGrade(AutonomousCar a[], String brand) {
        for (AutonomousCar autonomousCar : a) {
            if (autonomousCar.getBrand().equalsIgnoreCase(brand)) {
                return autonomousCar;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        AutonomousCar a[] = new AutonomousCar[4];

        for (int i = 0; i < a.length; i++) {
            int carId = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            int noOfTestsConducted = sc.nextInt();
            int noOfTestsPassed = sc.nextInt();
            sc.nextLine();
            String env = sc.nextLine();

            a[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, env);

        }

        String inputEnv = sc.nextLine();
        String inputBrand = sc.nextLine();

        int sum = findTestPassedByEnv(a, inputEnv);

        if (sum == 0) {
            System.out.println("There are notests passed in this particular environment");
        } else {
            System.out.println(sum);
        }
        AutonomousCar result = updateCarGrade(a, inputBrand);

        if (result == null) {
            System.out.println("No Car is available with the specified brand");

        } else {
            int rating = (result.getNoOfTestPassed() * 100) / result.getNoOfTestConducted();

            String grade;
            if (rating >= 80) {
                grade = "A1";
            } else {
                grade = "B2";
            }

            System.out.println(result.getBrand() + "::" + grade);

        }
    }
}
