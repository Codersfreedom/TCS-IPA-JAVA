package ShoppingItems;

import java.util.Scanner;

class ShoppingItems {
    private int ItemId;
    private String itemType;
    private String itemName;
    private double itemPrice;
    private int yearOfMfg;

    public ShoppingItems(int itemId, String itemType, String itemName, double itemPrice, int yearOfMfg) {
        ItemId = itemId;
        this.itemType = itemType;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.yearOfMfg = yearOfMfg;
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getYearOfMfg() {
        return yearOfMfg;
    }

    public void setYearOfMfg(int yearOfMfg) {
        this.yearOfMfg = yearOfMfg;
    }

}

public class Solution {

    public static int getItemCountForYear(ShoppingItems shoppingItems[], int year) {
        int count = 0;

        for (ShoppingItems si : shoppingItems) {
            if (si.getYearOfMfg() == year) {
                count++;

            }
        }
        return count;
    }

    public ShoppingItems getHighestPricItem(ShoppingItems shoppingItems[]) {
        ShoppingItems highestPriceItem = null;
        int highestPrice = Integer.MIN_VALUE;

        for (int i = 1; i < shoppingItems.length; i++) {
            if (shoppingItems[i].getItemPrice() > highestPrice) {
                highestPrice = (int) shoppingItems[i].getItemPrice();
                highestPriceItem = shoppingItems[i];
            }
        }
        return highestPriceItem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ShoppingItems shoppingItems[] = new ShoppingItems[4];

        for (int i = 0; i < shoppingItems.length; i++) {
            int itemId = sc.nextInt();
            sc.nextLine();
            String itemType = sc.nextLine();
            String itemName = sc.nextLine();
            double itemPrice = sc.nextDouble();
            int yearOfMfg = sc.nextInt();
            shoppingItems[i] = new ShoppingItems(itemId, itemType, itemName, itemPrice, yearOfMfg);
        }

        int year = sc.nextInt();

        int count = getItemCountForYear(shoppingItems, year);
        if (count == 0) {
            System.out.println("No items manufactured in the year " + year);
        } else {
            System.out.println("Number of items manufactured in the year " + year + " : " + count);
        }

        ShoppingItems highestPriceItem = new Solution().getHighestPricItem(shoppingItems);
        System.out.println("Item with highest price : " + highestPriceItem.getItemName());
        sc.close();
    }
}
