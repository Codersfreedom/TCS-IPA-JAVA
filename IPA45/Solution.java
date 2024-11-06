package IPA45;

import java.util.Scanner;

class Employee{
    String name;
    int age;
    double salary;

    Employee(String name,int age,double salary){
        this.name = name;
        this.age=age;
        this.salary=salary;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

}

public class Solution {
    static double calculateYearlySalary(Employee employee){
        double yearly_salary=0;

        yearly_salary = 12 * employee.getSalary();
        return yearly_salary;

    }

    static double calculateTax(Employee employee){
        double tax=0;

        double yearly_salary = calculateYearlySalary(employee);

        if(yearly_salary <=50000){
            tax = yearly_salary * 12 /100;
        }else if(yearly_salary >= 50000 && yearly_salary <= 100000){
            tax = ((yearly_salary -50000) *20 /100) + 50000*10/100 ;
        }else if(yearly_salary > 100000){
            tax = ((yearly_salary-100000)*0.3) + (50000*0.1) + (50000*0.2);

        }

        return tax;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();
        double salary = sc.nextDouble();
        sc.close();

        Employee employee = new Employee(name , age, salary);

        double yearly_salary = calculateYearlySalary(employee);

        System.out.println(yearly_salary);

        double tax = calculateTax(employee);
        System.out.println(tax);
    }
}
