package IPA3;

import java.util.Arrays;
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

    double getScore() {
        return this.score;
    }

    boolean getDayScholar() {
        return this.dayScholar;
    }

    int getRollNo() {
        return this.rollNo;
    }

    String getName() {
        return this.name;
    }

}

public class Solution {

    public static int findCountOfDayscholarStudents(Student s[], boolean dayScholar) {
        int count = 0;
        for (Student student : s) {
            if (student.getScore() > 80 && student.getDayScholar()) {
                count++;
            }
        }

        return count;
    }

    public static Student[] findStudentwithSecondHighestScore(Student s[], boolean dayScholar) {
        Student temp[] = new Student[0];

        for (Student student : s) {
            if (!student.getDayScholar()) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = student;
            }
        }

        Arrays.sort(temp, (a, b) -> (int) a.getScore() - (int) b.getScore());

        if (temp.length > 0) {
            return temp;
        } else {
            return null;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Student s[] = new Student[4];

        for (int i = 0; i < s.length; i++) {
            int rollNo = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double score = sc.nextDouble();
            boolean dayScholar = sc.nextBoolean();

            s[i] = new Student(rollNo, name, branch, score, dayScholar);

        }
      

        int count = findCountOfDayscholarStudents(s, true);

        if (count == 0) {
            System.out.println("There are no such dayscholar students");

        } else {
            System.out.println(count);
        }

        Student result[] = findStudentwithSecondHighestScore(s, false);

        if (result == null) {
            System.out.println("There are no student from no day scholar");
        } else {

            System.out.println(result[result.length - 2].getRollNo());
            System.out.println(result[result.length - 2].getName());
            System.out.println(result[result.length - 2].getScore());

        }
    }
}
