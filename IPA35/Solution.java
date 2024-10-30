package IPA35;

import java.util.Arrays;
import java.util.Scanner;

class Car {
    private int carId;
    private String carName;
    private String fuelType;

    Car(int carId, String carName, String fuelType) {
        this.carId = carId;
        this.carName = carName;
        this.fuelType = fuelType;
    }

    public int getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }

    public String getFuelType() {
        return fuelType;
    }
}

public class Solution {

    static Car[] RemoveAndRearrange(Car car[], int id) {
        Car temp[] = new Car[0];

        for (Car c : car) {
            if (c.getCarId() != id) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = c;
            }

        }
        if (temp.length > 0) {
            return temp;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car car[] = new Car[5];

        for (int i = 0; i < car.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String carName = sc.nextLine();
            String fuelType = sc.nextLine();

            car[i] = new Car(id, carName, fuelType);
        }

        int inputId = sc.nextInt();

        Car result[] = RemoveAndRearrange(car, inputId);

        if (result == null) {
            System.out.println("No two Car object would have the same engine id.");
        } else {
            for (Car c : result) {
                System.out.println(c.getCarId() + " " + c.getCarName());
            }
        }

    }
}
