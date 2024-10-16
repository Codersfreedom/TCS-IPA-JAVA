package IPA17;

import java.util.Arrays;
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date;

    Student(int rollNo, String name, String subject, char grade, String date) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public char getGrade() {
        return grade;
    }

    public String getDate() {
        return date;
    }

}

public class solution {

    static Student[] findStudentByGradeAndMonth(Student s[], char grade, int m) {
        Student temp[] = new Student[0];
        for (Student s1 : s) {
            String month[] = s1.getDate().split("/");
            System.out.println(Integer.parseInt(month[1]));
            if (s1.getGrade() == grade && Integer.parseInt(month[1]) == m) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = s1;

            }
        }

        Arrays.sort(temp, (a, b) -> a.getRollNo() - b.getRollNo());

        if (temp.length == 0) {

            return null;
        } else {
            return temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[4];
        for (int i = 0; i < s.length; i++) {
            int rollNo = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String subject = sc.nextLine();
            char grade = sc.nextLine().charAt(0);
            String date = sc.nextLine();

            s[i] = new Student(rollNo, name, subject, grade, date);
        }

        char grade = sc.nextLine().charAt(0);
        int month = sc.nextInt();
        sc.nextLine();

        Student result[] = findStudentByGradeAndMonth(s, grade, month);

        if (result == null) {
            System.out.println("No student found");
        } else {
            for (Student S : result) {
                System.out.println(S.getName());
                System.out.println(S.getSubject());
            }
            System.out.println(result.length);
        }

    }
}