package IPA36;

import java.util.Arrays;
import java.util.Scanner;

class MobileDetails {
    private int MobileId;
    private int Price;
    private String Brand;
    private boolean isFlagShip;

    MobileDetails(int MobileId, int Price, String Brand, boolean isFlagShip) {
        this.MobileId = MobileId;
        this.Price = Price;
        this.Brand = Brand;
        this.isFlagShip = isFlagShip;
    }

    public int getMobileId() {
        return MobileId;
    }

    public String getBrand() {
        return Brand;
    }

    public int getPrice() {
        return Price;
    }

    public boolean getIsFlagShip() {
        return isFlagShip;

    }

}

public class Mobile {
    static int getTotalPrice(MobileDetails mobile[], String brand) {
        int sum = 0;
       
        for (MobileDetails m : mobile) {
            if (m.getBrand().equalsIgnoreCase(brand)) {
                sum += m.getPrice();
            }
        }
System.out.println(brand);
        if (sum > 0) {
            return sum;
        } else {
            return 0;
        }
    }

    static MobileDetails[] getSecondMin(MobileDetails mobile[]) {

        Arrays.sort(mobile, (a, b) -> b.getPrice() - a.getPrice());

        return mobile;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MobileDetails mobile[] = new MobileDetails[5];

        for (int i = 0; i < mobile.length; i++) {
            int id = sc.nextInt();
            int price = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            boolean isFlagShip = sc.nextBoolean();
            sc.nextLine();
            mobile[i] = new MobileDetails(id, price, brand, isFlagShip);

        }
        String inputBrand = sc.nextLine();
        
        int result1 = getTotalPrice(mobile, inputBrand);
        if (result1 == 0) {
            System.out.println("No mobile found");
        } else {
            System.out.println(result1);
        }

        MobileDetails result2[] = getSecondMin(mobile);
        for (int i = 0; i < result2.length; i++) {
            for (int j = i + 1; j < result2.length; j++) {
                if (result2[i].getPrice() == result2[j].getPrice()
                        && result2[i].getMobileId() != result2[j].getMobileId()) {
                            System.out.println(result2[i].getPrice() + " "+result2[i].getBrand());
                            System.out.println(result2[j].getPrice() + " "+result2[j].getBrand());
                }

            }
        }

    }
}
