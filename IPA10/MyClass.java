package IPA10;

import java.util.Arrays;
import java.util.Scanner;

class Employee {
    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    Employee(int employeeId, String name, String branch, double rating, boolean companyTransport) {
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }

    int getEmployeeId() {
        return employeeId;
    }

    String getName() {
        return name;
    }

    String getBranch() {
        return branch;
    }

    boolean getCompanyTransport() {
        return companyTransport;
    }

    double getRating() {
        return rating;
    }
}

public class MyClass {

    static int findCountOfEmployeesUsingCompTransport(Employee e[], String branch) {
        int count = 0;
        for (Employee employee : e) {
            if (employee.getCompanyTransport() && employee.getBranch().equals(branch)) {
                count++;
            }
        }

        if (count > 0) {
            return count;
        } else {
            return 0;
        }
    }

    static Employee[] findEmployeeWithSecondHighestRating(Employee e[]) {
        Employee temp[] = new Employee[0];

        for (Employee employee : e) {
            if (!employee.getCompanyTransport()) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = employee;
            }
        }

        if (temp.length == 0) {
            return null;
        }

        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i].getRating() > temp[j].getRating()) {
                    Employee k = temp[i];
                    temp[i] = temp[j];
                    temp[j] = k;
                }
            }

        }
        return temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Employee em[] = new Employee[4];

        for (int i = 0; i < em.length; i++) {
            int employeeId = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = sc.nextDouble();
            boolean companyTransport = sc.nextBoolean();
            sc.nextLine();
            em[i] = new Employee(employeeId, name, branch, rating, companyTransport);

        }

        String inputBranch = sc.nextLine();

        int count = findCountOfEmployeesUsingCompTransport(em, inputBranch);

        if (count == 0) {
            System.out.println("No such Employees");
        } else {
            System.out.println(count);
        }

        Employee result[] = findEmployeeWithSecondHighestRating(em);

        if (result == null) {
            System.out.println("All Employees using company transport ");
        } else {
            System.out.println(result[result.length-2].getEmployeeId() + " "+ result[result.length-2].getName());
        }
    }
}
