package Policy;

import java.util.Scanner;

public class Solution {

    public static double getCalculatedPolicyAmount(Policy policy[], int policyId, boolean claimed,
            int percentageAlreadyClaimed) {
        double newPolicyAmount = 0;
        for (Policy p : policy) {
            if (p.getPolicyId() == policyId && claimed) {
                newPolicyAmount = p.getPolicyAmount() - p.getPolicyAmount() * percentageAlreadyClaimed / 100;
                p.setPolicyAmount(newPolicyAmount);
            }
        }
        return newPolicyAmount;
    }

    public static Policy getPolicyWithAmountRange(Policy policy[], double max, double min) {

        for (Policy p : policy) {
            if (p.getPolicyAmount() < max && p.getPolicyAmount() > min) {
                return p;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Policy policy[] = new Policy[4];

        for (int i = 0; i < policy.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            boolean e = sc.nextBoolean();

            policy[i] = new Policy(a, b, c, d, e);
            
        }

        int policyId = sc.nextInt();
        sc.nextLine();
        boolean claimed = sc.nextBoolean();
        int percentageAlreadyClaimed = sc.nextInt();

        double max = sc.nextDouble();
        double min = sc.nextDouble();

        sc.close();

        double result1 = getCalculatedPolicyAmount(policy, policyId, claimed, percentageAlreadyClaimed);

        if (result1 > 0) {
            System.out.println(result1);
        } else {
            System.out.println("Not claimble");
        }

        Policy result2 = getPolicyWithAmountRange(policy, max, min);

        if (result2 == null) {
            System.out.println("No policy found");
        } else {
            System.out.println(result2.getPolicyId());
            System.out.println(result2.getPolicyAmount());
            System.out.println(result2.getPolicyName());
        }

    }
}

class Policy {
    private int policyId;
    private String policyName;
    private String paymentMode;
    private double policyAmount;
    private boolean claimed;

    public Policy(int policyId, String policyName, String paymentMode, double policyAmount, boolean claimed) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.paymentMode = paymentMode;
        this.policyAmount = policyAmount;
        this.claimed = claimed;
    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public double getPolicyAmount() {
        return policyAmount;
    }

    public void setPolicyAmount(double policyAmount) {
        this.policyAmount = policyAmount;
    }

    public boolean isClaimed() {
        return claimed;
    }

    public void setClaimed(boolean claimed) {
        this.claimed = claimed;
    }

}
