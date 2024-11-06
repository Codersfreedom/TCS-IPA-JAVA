package IPA42;

import java.util.Scanner;

class Person {
    String firstName;
    String lastName;
    int age;
    char gender;

    Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

}

class Student extends Person {
    String rollNo;
    String course;
    int semester;
    double GPA;

    Student(String firstName, String lastName, int age, char gender, String rollNo, String course, int semester,
            double GPA) {
        super(firstName, lastName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;

    }

    public double getGPA() {
        return GPA;
    }

    String getRollNo() {
        return rollNo;
    }

    String getCourse() {
        return course;
    }

}

class Faculty extends Person {
    String employeeId;
    String department;
    String designation;
    double salary;

    Faculty(String fn, String ln, int age, char gender, String id, String dp, String des, double sal) {
        super(fn, ln, age, gender);

        this.employeeId = id;
        this.department = dp;
        this.designation = des;
        this.salary = sal;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

}

public class Solution {

    static Student findHighestGPAStudent(Student student[]) {
        Student temp = null;
        double max_gpa = Double.MIN_VALUE;

        for (Student s : student) {
            if (s.getGPA() > max_gpa) {
                max_gpa = s.getGPA();
                temp = s;
            }
        }

        return temp;
    }

    static Faculty findHighestPaidFaculty(Faculty faculty[]) {
        Faculty temp = null;

        double max_sal = Double.MIN_VALUE;

        for (Faculty f : faculty) {
            if (f.getSalary() > max_sal) {
                max_sal = f.getSalary();
                temp = f;
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student[] = new Student[2];
        Faculty faculty[] = new Faculty[2];

        for (int i = 0; i < student.length; i++) {
            String fn = sc.nextLine();
            String ln = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            char gender = sc.nextLine().charAt(0);

            String roll = sc.nextLine();
            String course = sc.nextLine();
            int sem = sc.nextInt();
            double GPA = sc.nextDouble();
            sc.nextLine();
            student[i] = new Student(fn, ln, age, gender, roll, course, sem, GPA);
        }

        for (int i = 0; i < faculty.length; i++) {
            String fn = sc.nextLine();
            String ln = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            char gender = sc.nextLine().charAt(0);

            String id = sc.nextLine();
            String dept = sc.nextLine();
            String des = sc.nextLine();
            double salary = sc.nextDouble();
            sc.nextLine();
            faculty[i] = new Faculty(fn, ln, age, gender, id, dept, des, salary);

        }

        Student result1 = findHighestGPAStudent(student);

        if (result1 == null) {
            System.out.println("Sorry - No student is available");
        } else {
            System.out.println(result1.getRollNo());
            System.out.println(result1.getCourse());
            System.out.println(result1.getGPA());

        }

        Faculty result2 = findHighestPaidFaculty(faculty);

        if (result2 == null) {
            System.out.println("Sorry- No faculty is available");
        } else {
            System.out.println(result2.getEmployeeId());
            System.out.println(result2.getDepartment());
            System.out.println(result2.getSalary());
        }

    }
}
