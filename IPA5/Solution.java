package IPA5;

import java.util.Scanner;

class Motel {
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility,
            double totalBill) {
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }

    String getCabFacility() {
        return cabFacility;
    }

    int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

}

public class Solution {

    public static int totalNoOfRoomsBooked(Motel m[], String cabFacility) {
        for (Motel motel : m) {
            if (motel.getCabFacility().equalsIgnoreCase(cabFacility) && motel.getNoOfRoomsBooked() > 5) {
                return motel.getNoOfRoomsBooked();
            }
        }

        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Motel m[] = new Motel[4];

        for (int i = 0; i < m.length; i++) {
            int motelId = sc.nextInt();
            sc.nextLine();
            String motelName = sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();
            String cabFacility = sc.nextLine();
            double totalBill = sc.nextDouble();
            sc.nextLine();

            m[i] = new Motel(motelId, motelName, dateOfBooking, noOfRoomsBooked, cabFacility, totalBill);

        }

        String inputCabFacility = sc.nextLine();
        sc.close();
        int result = totalNoOfRoomsBooked(m, inputCabFacility);
        if (result == 0) {
            System.out.println("No such rooms booked");
        } else {
            System.out.println(result);
        }
    }
}
