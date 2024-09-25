package IPA2;

import java.util.Arrays;
import java.util.Scanner;

class FootWear {
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    FootWear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    int getFootWearId(){
        return this.footwearId;
    }
    String getFootWearType() {
        return this.footwearType;
    }

    String getFootWearName() {
        return this.footwearName;
    }

    int getFootWearPrice() {
        return this.price;
    }
}

public class FootWearProgram {

    public static int getCountByType(FootWear f[], String type) {

        int count = 0;

        for (FootWear footWear : f) {
            if (footWear.getFootWearType().equalsIgnoreCase(type)) {
                count++;
            }
        }

        if (count > 0) {
            return count;
        } else {
            return 0;
        }

    }

    public static FootWear[] getSecondHighestPriceByBrand(FootWear f[], String footWearName) {
        FootWear temp[] = new FootWear[0];

        for (FootWear footWear : f) {
            if (footWear.getFootWearName().equalsIgnoreCase(footWearName)) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = footWear;
            }

            Arrays.sort(temp, (a, b) -> b.getFootWearPrice() - a.getFootWearPrice());

        }
        if (temp.length > 0) {
            return temp;
        } else {
            return null;
        }

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        FootWear f[] = new FootWear[5];

        for (int i = 0; i < f.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            f[i] = new FootWear(id, name, type, price);
        }

        String inputFootWearType = sc.nextLine();
        String inputFootWearName = sc.nextLine();
        sc.close();
        int count = getCountByType(f, inputFootWearType);

        if (count == 0) {
            System.out.println("Footwear not available");
        } else {
            System.out.println(count);
        }

        FootWear result[] = getSecondHighestPriceByBrand(f, inputFootWearName);

        if (result == null) {
            System.out.println("Brand not available");
        } else {

            System.out.println(result[result.length - 2].getFootWearId());
            System.out.println(result[result.length - 2].getFootWearName());
            System.out.println(result[result.length - 2].getFootWearPrice());
        }

    }
}
