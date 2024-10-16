package IPA19;

import java.util.Arrays;
import java.util.Scanner;

class Flowers {
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;

    Flowers(int flowerId, String flowerName, int price, int rating, String type) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;

    }

    public int getFlowerId() {
        return flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public String getType() {
        return type;
    }

}

public class MyClass {

    static Flowers[] findMinPriceByType(Flowers f[], String type) {
        Flowers temp[] = new Flowers[0];

        for (Flowers F : f) {
            if (F.getType().equalsIgnoreCase(type)  && F.getRating() > 3) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = F;
            }
        }

        if (temp.length == 0) {
            return null;
        } else {
            Arrays.sort(temp, (a, b) -> a.getPrice() - b.getPrice());
            return temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Flowers f[] = new Flowers[4];

        for (int i = 0; i < f.length; i++) {
            int flowerId = sc.nextInt();
            sc.nextLine();
            String flowerName = sc.nextLine();
            int price = sc.nextInt();
            int rating = sc.nextInt();
            sc.nextLine();
            String type = sc.nextLine();

            f[i] = new Flowers(flowerId, flowerName, price, rating, type);

        }

        String inputType = sc.nextLine();
        sc.close();

        Flowers flowers[] = findMinPriceByType(f, inputType);

        if (flowers == null) {
            System.out.println("There is no flower with given type");
        } else {
            System.out.println(flowers[0].getFlowerId());
        }
    }
}
