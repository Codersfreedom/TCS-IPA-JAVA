package Watch;

import java.util.Scanner;

public class Solution {

    public static boolean isStartsWithVowel(String str) {
        char ch = str.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public static int countWatcherByBrand(Watch watches[], String brandName) {
        int count = 0;
        for (Watch watch : watches) {
            if (watch.getBrand().equalsIgnoreCase(brandName) && isStartsWithVowel(watch.getBrand())) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Watch watches[] = new Watch[4];

        for (int i = 0; i < 4; i++) {
            int watchId = sc.nextInt();
            sc.nextLine();
            String watchName = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            String brand = sc.nextLine();
            watches[i] = new Watch(watchId, watchName, price, brand);
        }

        String inputBrandName = sc.nextLine();

        int result = countWatcherByBrand(watches, inputBrandName);

        if (result == 0) {
            System.out.println("No watches available with brand name starting with vowel");
        } else {
            System.out.println(result);
        }
    }
}

class Watch {
    private int watchId;
    private String watchName;
    private double price;
    private String brand;

    public Watch(int watchId, String watchName, double price, String brand) {
        this.watchId = watchId;
        this.watchName = watchName;
        this.price = price;
        this.brand = brand;
    }

    public int getWatchId() {
        return watchId;
    }

    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }

    public String getWatchName() {
        return watchName;
    }

    public void setWatchName(String watchName) {
        this.watchName = watchName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}