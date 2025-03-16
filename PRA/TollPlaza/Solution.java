package TollPlaza;

import java.util.Scanner;

public class Solution {
    public static double getPlaymentMethodWiseTotalCollection(TollPlaza tollPlaza[], String modeOfPayment) {
        double total = 0;

        for (TollPlaza t : tollPlaza) {
            if (t.getModeOfPlayment().equalsIgnoreCase(modeOfPayment)) {
                total += t.getFare();
            }
        }

        return total;
    }

    public static TollPlaza findVehicleWithVehicleId(TollPlaza tollPlaza[], String vehicleId) {
        TollPlaza temp = null;

        for (TollPlaza t : tollPlaza) {
            if (t.getVehicleId().equalsIgnoreCase(vehicleId)) {
                temp = t;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TollPlaza tollPlaza[] = new TollPlaza[5];

        for (int i = 0; i < tollPlaza.length; i++) {
            String vehicleId = sc.nextLine();
            String vehicleType = sc.nextLine();
            String modeOfPayment = sc.nextLine();
            double fare = sc.nextDouble();
            sc.nextLine();

            tollPlaza[i] = new TollPlaza(vehicleId, vehicleType, modeOfPayment, fare);
        }

        String modeOfPayment = sc.nextLine();
        String vehicleId = sc.nextLine();

        double result1 = getPlaymentMethodWiseTotalCollection(tollPlaza, modeOfPayment);

        if (result1 > 0) {
            System.out.println(result1);
        } else {
            System.out.println("No vehicle with this payment method available");
        }

        TollPlaza t = findVehicleWithVehicleId(tollPlaza, vehicleId);

        if (t == null) {
            System.out.println("No vehicle with this id");
        } else {
            System.out.println(t.getVehicleId());
            System.out.println(t.getVehicleType());
            System.out.println(t.getModeOfPlayment());
            System.out.println(t.getFare());
        }
    }
}

class TollPlaza {
    private String vehicleId;
    private String vehicleType;
    private String modeOfPlayment;
    private double fare;

    public TollPlaza(String vehicleId, String vehicleType, String modeOfPlayment, double fare) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.modeOfPlayment = modeOfPlayment;
        this.fare = fare;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getModeOfPlayment() {
        return modeOfPlayment;
    }

    public void setModeOfPlayment(String modeOfPlayment) {
        this.modeOfPlayment = modeOfPlayment;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

}