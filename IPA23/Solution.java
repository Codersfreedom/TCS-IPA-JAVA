package IPA23;

import java.util.Scanner;

class Institution {
    private int InstitutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    Institution(int InstitutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared,
            String location) {
        this.InstitutionId = InstitutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;

    }

    public int getInstitutionId() {
        return InstitutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade() {
        int rating = (noOfStudentsPlaced * 100) / noOfStudentsCleared;

        if (rating >= 80) {
            this.grade = "A";
        } else {
            this.grade = "B";
        }
    }

}

public class Solution {

    static int FindNumClearancedByLoc(Institution institution[], String location) {
        int sum = 0;
        for (Institution I : institution) {
            if (I.getLocation().equalsIgnoreCase(location)) {
                sum += I.getNoOfStudentsCleared();
            }
        }

        if (sum > 0) {
            return sum;
        } else {
            return 0;
        }
    }

    static Institution UpdateInstitutionGrade(Institution institution[], String institutionName) {

        for (Institution I : institution) {
            if (I.getInstitutionName().equalsIgnoreCase(institutionName)) {
                I.setGrade();
                return I;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Institution institution[] = new Institution[4];

        for (int i = 0; i < institution.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();

            institution[i] = new Institution(a, b, c, d, e);

        }

        String location = sc.nextLine();
        String institutionName = sc.nextLine();
        sc.close();

        int result1 = FindNumClearancedByLoc(institution, location);
        if (result1 == 0) {
            System.out.println("No such institution");
        } else {
            System.out.println(result1);
        }

        Institution result2 = UpdateInstitutionGrade(institution, institutionName);

        if (result2 == null) {
            System.out.println("No such");
        } else {
            System.out.println( result2.getInstitutionName()+"::"+result2.getGrade());
        }

    }
}
