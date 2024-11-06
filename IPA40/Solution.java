package IPA40;

import java.util.*;

class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

}

public class Solution {

    static Car findMostExpensiveCar(Car car[]) {
        Car temp = null;

        double high = Double.MIN_VALUE;

        for (Car c : car) {
            if (c.getPrice() > high) {
                high = c.getPrice();
                temp = c;
            }
        }

        return temp;

    }

    static Car[] getCarByMakeAndModel(Car car[], String make, String model) {
        Car temp[] = new Car[0];

        for (Car c : car) {
            if (c.getMake().equalsIgnoreCase(make) && c.getModel().equalsIgnoreCase(model)) {
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Car car[] = new Car[4];

        for (int i = 0; i < car.length; i++) {
            String make = sc.nextLine();
            String model = sc.nextLine();
            int year = sc.nextInt();
            double price = sc.nextDouble();
            sc.nextLine();

            car[i] = new Car(make, model, year, price);
        }

        String inputMake = sc.nextLine();
        String inputModel = sc.nextLine();

        Car result1 = findMostExpensiveCar(car);
        if(result1 ==null){
            System.out.println("Sorry-No car is available.");
        }else{
            System.out.println(result1.getMake());
            System.out.println(result1.getModel());
            System.out.println(result1.getYear());
            System.out.println(result1.getPrice());

        }

        Car result2[] = getCarByMakeAndModel(car, inputMake, inputModel);

        if(result2 ==null){
            System.out.println("Sorry- No car is available.");

        }else{
            for(Car c:result2){
                System.out.println(c.getYear());
                System.out.println(c.getPrice());

            }
        }
    }
}