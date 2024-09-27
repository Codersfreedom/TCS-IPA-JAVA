package IPA16;

import java.util.Scanner;

class NavalVessel {
    private int vesselld;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;

    NavalVessel(int vesselld, String name, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselld = vesselld;
        this.vesselName = name;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose=purpose;

    }

    String getName() {
        return vesselName;
    }

    int getPercentage() {
        return (noOfVoyagesCompleted * 100) / noOfVoyagesPlanned;
    }

    int getNoOfPlanned() {
        return noOfVoyagesPlanned;
    }

    int getNoOfCompleted() {
        return noOfVoyagesCompleted;
    }

    String getPurpose() {
        return purpose;
    }
}

public class Solution {

    static int findAvgVoyagesByPct(NavalVessel nv[], int percentage) {
        int sum = 0;
        int count = 0;

        for (NavalVessel n : nv) {
            if (n.getPercentage() >= percentage) {
                sum += n.getNoOfCompleted();
                count++;
            }
        }

        if (sum > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }

    static NavalVessel findVesselByGrade(NavalVessel nv[], String purpose) {
        for (NavalVessel n : nv) {
            if (n.getPurpose().equalsIgnoreCase(purpose)) {
                return n;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NavalVessel nv[] = new NavalVessel[4];

        for (int i = 0; i < nv.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int planned = sc.nextInt();
            int completed = sc.nextInt();
            sc.nextLine();
            String purpose = sc.nextLine();

            nv[i] = new NavalVessel(id, name, planned, completed, purpose);
        }

        int inputPercentage = sc.nextInt();
        sc.nextLine();
        String inputPurpose = sc.nextLine();

        int result1 = findAvgVoyagesByPct(nv, inputPercentage);

        if (result1 == 0) {
            System.out.println("No");
        } else {
            System.out.println(result1);
        }

        NavalVessel result2 = findVesselByGrade(nv, inputPurpose);

        if (result2 == null) {
            System.out.println("No Naval Velles is available with the specified purpose");
        } else {
            int percentage = result2.getPercentage();
            String grade;
            if (percentage == 100) {
                grade = "Star";
            } else if (percentage >= 80 && percentage <= 99) {
                grade = "Leader";
            } else if (percentage >= 55 && percentage <= 79) {
                grade = "Inspirer";
            } else {
                grade = "Striver";
            }

            System.out.println(result2.getName() + "::" + grade);
        }

    }
}