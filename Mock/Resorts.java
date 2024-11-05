import java.util.Scanner;

class Resort {
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    Resort(int resortId, String resortName, String category, double price, double rating) {
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;

    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return (int) price;
    }

    public double getRating() {
        return rating;
    }

    public int getResortId() {
        return resortId;
    }

    public String getResortName() {
        return resortName;
    }
}

public class Resorts {

    static int findAvgPriceByCategory(Resort resort[], String category) {
        int price = 0;
        int count = 0;
        for (Resort r : resort) {
            if (r.getCategory().equalsIgnoreCase(category) && r.getRating() > 4) {
                price += r.getPrice();
                count++;
            }
        }

        if (count > 0) {
            return (price / count);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Resort resort[] = new Resort[4];

        for (int i = 0; i < resort.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            double e = sc.nextDouble();

            sc.nextLine();

            resort[i] = new Resort(a, b, c, d, e);
        }
        String category = sc.nextLine();

        int result = findAvgPriceByCategory(resort, category);

        if (result == 0) {
            System.out.println("There are no such available resort. ");
        } else {
            System.out.println(result);
        }
    }
}
