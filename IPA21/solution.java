package IPA21;

import java.util.Arrays;
import java.util.Scanner;

class Fruits {
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;

    Fruits(int fruitId, String fruitName, int price, int rating) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }

    public int getFruitId() {
        return fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

}

public class solution {

    static Fruits[] findMaximumPriceByRating(Fruits f[], int rating) {

        Fruits temp[] = new Fruits[0];

        for (Fruits F : f) {
            if (F.getRating() > rating) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = F;
            }
        }
        if (temp.length == 0) {
            return null;
        }
        Arrays.sort(temp, (a, b) -> b.getPrice() - a.getPrice());

        return temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fruits fruits[] = new Fruits[4];

        for (int i = 0; i < fruits.length; i++) {
            int fruitId = sc.nextInt();
            sc.nextLine();
            String fruitName = sc.nextLine();
            int price = sc.nextInt();
            int rating = sc.nextInt();

            fruits[i] = new Fruits(fruitId, fruitName, price, rating);

        }

        int rating = sc.nextInt();
        sc.close();

        Fruits result[] = findMaximumPriceByRating(fruits, rating);

        if (result ==null) {
            System.out.println("No such Fruit");

        } else {
            System.out.println(result[0].getFruitId());
        }
    }
}
