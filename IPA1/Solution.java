package IPA1;

import java.util.Arrays;
import java.util.Scanner;

class Course {

    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quize;
    private int handson;

    Course(int courseId, String courseName, String courseAdmin, int quize, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quize = quize;
        this.handson = handson;
    }

    String getCourseName() {
        return this.courseName;
    }

    int getQuize() {
        return this.quize;
    }

    String getCourseAdmin() {
        return this.courseAdmin;

    }

    int getHandsOn() {
        return this.handson;
    }
}

public class Solution {

    public static int findAvgOfQuizeByAdmin(Course c[], String AdminName) {
        int sum = 0;
        int count = 0;

        for (Course course : c) {
            if (course.getCourseAdmin().equalsIgnoreCase(AdminName)) {
                sum += course.getQuize();
                count++;

            }

        }

        if (sum > 0) {
            return sum / count;
        } else {
            return 0;
        }

    }

    public static Course[] sortCourseByHandsOn(Course c[], int handsOn) {
        Course temp[] = new Course[0];

        for (Course course : c) {
            if (course.getHandsOn() < handsOn) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = course;
            }
        }

        Arrays.sort(temp, (a, b) -> a.getHandsOn() - b.getHandsOn());

        if (temp.length > 0) {
            return temp;
        } else {
            return null;
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Course c[] = new Course[4];

        for (int i = 0; i < c.length; i++) {
            int courseId = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();
           
            int quize = sc.nextInt();
            int handson = sc.nextInt();
            sc.nextLine();
            c[i] = new Course(courseId, courseName, courseAdmin, quize, handson);

        }

        String inputAdmin = sc.nextLine();
        int inputHandson = sc.nextInt();
        sc.close();
        int average = findAvgOfQuizeByAdmin(c, inputAdmin);

        if (average == 0) {
            System.out.println("No Course found");
        } else {
            System.out.println(average);
        }

        Course result[] = sortCourseByHandsOn(c, inputHandson);

        if (result == null) {
            System.out.println("No Course found with mentioned attribute");

        } else {
            for (Course res : result) {
                System.out.println(res.getCourseName());
            }
        }
    }
}