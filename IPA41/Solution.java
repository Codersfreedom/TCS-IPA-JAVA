package IPA41;

import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double withDraw(double amount) {

        return this.balance -= amount;

    }

    public double depositAmount(double amount) {

        return this.balance += amount;

    }
}

public class Solution {

    static double withdraw(BankAccount bank[], int account) {
        Scanner sc = new Scanner(System.in);

        double updated_balance = 0;

        for (BankAccount b : bank) {
            if (b.getAccountNumber() == account) {
                System.out.println("Enter Withdraw amount");
                double ammount = sc.nextDouble();
                sc.nextLine();

                if (b.getBalance() >= ammount) {
                    updated_balance = b.withDraw(ammount);
                    return updated_balance;

                } else {
                    return -1;
                }
            }
        }
        return -2;

    }

    static double deposit(BankAccount bank[], int account) {
        Scanner sc = new Scanner(System.in);

        for (BankAccount b : bank) {
            if (b.getAccountNumber() == account) {
                System.out.println("Enter deposit amount");
                double amount = sc.nextDouble();
                
                double updated_balance = b.depositAmount(amount);
                return updated_balance;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount bank[] = new BankAccount[3];

        for (int i = 0; i < bank.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();

            bank[i] = new BankAccount(a, b, c);

        }

        int wa = sc.nextInt();
        int da = sc.nextInt();

        double result1 = withdraw(bank, wa);

        if (result1 == -2) {
            System.out.println("Sorry - Account not found");
        } else if (result1 == -1) {
            System.out.println("Sorry- Insufficient balance");
        } else if (result1 >= 0) {
            System.out.println(result1);
        }

        double result2 = deposit(bank, da);

        if (result2 == -1) {
            System.out.println("Sorry- Account not found");
        } else {
            System.out.println(result2);
        }

    }
}
