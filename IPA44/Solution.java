package IPA44;

import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

}

public class Solution {

    static double calculateArea(Rectangle rectangle) {
        double area;

        area = rectangle.getLength() * rectangle.getBreadth();

        return area;

    }

    static double calculatePerimeter(Rectangle rectangle) {
        double perimeter;

        perimeter = 2 * (rectangle.getBreadth() + rectangle.getLength());
        return perimeter;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle[] = new Rectangle[2];

        for (int i = 0; i < rectangle.length; i++) {
            double length = sc.nextDouble();
            double breadth = sc.nextDouble();
            rectangle[i] = new Rectangle(length, breadth);

        }

        for (int i = 0; i < rectangle.length; i++) {
            double area = calculateArea(rectangle[i]);
            double perimeter = calculatePerimeter(rectangle[i]);
            System.out.println(area);
            System.out.println(perimeter);
        }

    }
}
