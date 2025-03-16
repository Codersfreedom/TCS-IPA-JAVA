package Toy;

import java.util.Scanner;

public class Solution {

    public static double findAveragePricePerCategory(Toy toys[], String category) {
        double sum = 0;
        int count = 0;

        for (Toy toy : toys) {
            if (toy.getCategory().equalsIgnoreCase(category)) {
                sum += toy.getPrice();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public static Toy findToyWithHighestPrice(Toy toys[], String category) {
        Toy temp = null;
        double max = 0;

        for (Toy toy : toys) {
            if (toy.getCategory().equalsIgnoreCase(category)) {
                if (toy.getPrice() > max) {
                    max = toy.getPrice();
                    temp = toy;
                }
            }
        }

        if (temp != null) {
            double newPrice = temp.getPrice() - temp.getPrice() * temp.getDiscount() / 100;
            temp.setPrice(newPrice);
            return temp;
        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Toy toys[] = new Toy[5];

        for (int i = 0; i < 5; i++) {
            int toyId = sc.nextInt();
            sc.nextLine();
            String toyName = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();
            double discount = sc.nextDouble();
            sc.nextLine();
            toys[i] = new Toy(toyId, toyName, category, price, discount);
        }

        String category1 = sc.nextLine();
        String category2 = sc.nextLine();

        double avgPrice = findAveragePricePerCategory(toys, category1);

        if (avgPrice == 0) {
            System.out.println("No toys in the given category");
        } else {
            System.out.println(avgPrice);
        }

        Toy toy = findToyWithHighestPrice(toys, category2);

        if (toy == null) {
            System.out.println("No toys in the given category");

        } else {
            System.out.println(toy.getToyId());
            System.out.println(toy.getToyName());
            System.out.println(toy.getCategory());
        }
    }
}

class Toy {
    private int toyId;
    private String toyName;
    private String category;
    private double price;
    private double discount;

    public Toy(int toyId, String toyName, String category, double price, double discount) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.category = category;
        this.price = price;
        this.discount = discount;
    }

    public int getToyId() {
        return toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}