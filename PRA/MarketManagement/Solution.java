package MarketManagement;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static int findTotalPriceForGivenCategory(Market markets[], String category) {
        int total = 0;
        for (Market market : markets) {
            if (market.getCategory().equalsIgnoreCase(category)) {
                total += market.getPrice();
            }

        }

        return total;
    }

    public static Market findAvailableItemWithThirdMinimumPrice(Market markets[]) {
        Market temp[] = new Market[0];

        for (Market market : markets) {
            if (market.isAvailable()) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = market;
            }

        }

        if (temp.length >= 3) {
            Arrays.sort(temp, (a, b) -> a.getPrice() - b.getPrice());
            return temp[2];
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Market[] market = new Market[4];

        for (int i = 0; i < market.length; i++) {
            int marketId = sc.nextInt();
            sc.nextLine();
            String itemName = sc.nextLine();
            String category = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            boolean available = sc.nextBoolean();
            sc.nextLine();

            market[i] = new Market(marketId, itemName, category, price, available);
        }

        String category = sc.nextLine();

        int result1 = findTotalPriceForGivenCategory(market, category);
        Market result2 = findAvailableItemWithThirdMinimumPrice(market);

        if (result1 > 0) {
            System.out.println(result1);
        } else {
            System.out.println("No items available");
        }

        if (result2 != null) {
            System.out.println(result2.getMarketId());
            System.out.println(result2.getPrice());
        } else {
            System.out.println("No items available");
        }

    }

}

class Market {
    private int marketId;
    private String itemName;
    private String category;
    private int price;
    private boolean available;

    public Market(int marketId, String itemName, String category, int price, boolean available) {
        this.marketId = marketId;
        this.itemName = itemName;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

