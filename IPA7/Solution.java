package IPA7;

import java.util.Arrays;
import java.util.Scanner;

class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    int getSimId() {
        return simId;
    }

    String getCustomerName() {
        return customerName;
    }

    String getCircle() {
        return circle;
    }

    double getRatePerSecond() {
        return ratePerSecond;
    }

    void setCircle(String circle) {
        this.circle = circle;
    }
}

public class Solution {

    static Sim[] transferCustomerCircle(Sim s[], String circle1, String circle2) {
        Sim temp[] = new Sim[0];

        for (Sim si : s) {
            if (si.getCircle().equalsIgnoreCase(circle1)) {
                si.setCircle(circle2);
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = si;

            }

        }

       for(int i=0;i<temp.length;i++){
        for(int j=i+1;j<temp.length;j++){
            if(temp[i].getRatePerSecond()<temp[j].getRatePerSecond()){
                Sim k = temp[i];
                temp[i] = temp[j];
                temp[j] = k;
            }
        }
       }

        if (temp.length > 0) {
            return temp;
        } else {
            return null;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Sim s[] = new Sim[5];

        for (int i = 0; i < s.length; i++) {
            int simId = sc.nextInt();
            sc.nextLine();
            String customerName = sc.nextLine();
            double balance = sc.nextDouble();
            double ratePerSecond = sc.nextDouble();
            sc.nextLine();
            String circle = sc.nextLine();

            s[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);

        }

        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        Sim result[] = transferCustomerCircle(s, circle1, circle2);

        if (result == null) {
            System.out.println("Not found");
        } else {
            for (Sim si : result) {
                System.out.println(si.getSimId() + " " + si.getCustomerName() + " " + si.getCircle() + " "
                        + si.getRatePerSecond());

            }
        }
    }
}
