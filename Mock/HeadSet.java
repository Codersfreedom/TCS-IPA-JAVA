import java.util.Arrays;
import java.util.Scanner;

class HeadSets {
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    HeadSets(String headsetName, String brand, int price, boolean available) {
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public String getBrand() {
        return brand;
    }

    public String getHeadsetName() {
        return headsetName;
    }

    public int getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return available;
    }
}

public class HeadSet {

    static int findTotalPriceForGivenBrand(HeadSets headset[], String brand) {
        int total_price = 0;

        for (HeadSets h : headset) {
            if (h.getBrand().equalsIgnoreCase(brand)) {
                total_price += h.getPrice();
            }
        }

        return total_price;
    }

    static HeadSets[] findAvailableHeadsetWithSecondMinPrice(HeadSets headSets[]) {

        HeadSets temp[] = new HeadSets[0];

        for (HeadSets h : headSets) {
            if (h.getAvailability()) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = h;
            }

        }

        if (temp.length == 0) {
            return null;
        } else {
            Arrays.sort(temp,(a,b)->b.getPrice()-a.getPrice());
            return temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HeadSets headset[] = new HeadSets[4];

        for (int i = 0; i < headset.length; i++) {
            String name = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            boolean available = sc.nextBoolean();
            sc.nextLine();

            headset[i] = new HeadSets(name, brand, price, available);
        }

        String inputBrand = sc.nextLine();

        int result1 = findTotalPriceForGivenBrand(headset, inputBrand);
        if (result1 == 0) {
            System.out.println("No Headsets available with the given brand.");
        }else{
            System.out.println(result1);
        }

        HeadSets result2[] = findAvailableHeadsetWithSecondMinPrice(headset);

        if(result2 ==null){
            System.out.println("No Headsets available.");
        }else{
            System.out.println(result2[result2.length-2].getHeadsetName());
            System.out.println(result2[result2.length-2].getPrice());
        }
    }
}
