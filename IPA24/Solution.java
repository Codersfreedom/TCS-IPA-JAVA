package IPA24;

import java.util.Arrays;
import java.util.Scanner;

class Inventory {
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

}

public class Solution {

    static Inventory[] Replenish(Inventory inventory[], int limit) {
        Inventory temp[] = new Inventory[0];
        for (Inventory I : inventory) {
            if (I.getThreshold() <= limit) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = I;
            }
        }
        if (temp.length == 0) {

            return null;
        } else {
            return temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory inventory[] = new Inventory[4];

        for (int i = 0; i < inventory.length; i++) {
            String a = sc.nextLine();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();sc.nextLine();

            inventory[i] = new Inventory(a, b, c, d);

        }

        int limit = sc.nextInt();
        sc.close();

        Inventory result[] = Replenish(inventory, limit);

        for (Inventory I : result) {
            if (I.getThreshold() > 75) {
                System.out.println(I.getInventoryId() + " Critical Filling");
            } else if (I.getThreshold() >= 50 && I.getThreshold() <= 75) {
                System.out.println(I.getInventoryId() + " Moderate Filling");
            } else {
                System.out.println("Non-Critical FIlling");
            }
        }

    }
}
