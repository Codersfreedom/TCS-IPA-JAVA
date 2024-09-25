package IPA4;

import java.text.CollationElementIterator;
import java.util.Scanner;

class College {
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pinCode;

    College(int id, String name, int contactNo, String address, int pinCode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pinCode = pinCode;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    int getContactNo() {
        return contactNo;
    }

    int getPinCode() {
        return pinCode;
    }

    String getAddress() {
        return address;
    }
}

public class Solution {

    public static College findCollegeWithMaximumPincode(College c[]) {
        int max = 0;

        for (College college : c) {
            if (college.getPinCode() > max) {
                max = college.getPinCode();
            }

        }

        for (College college : c) {
            if (college.getPinCode() == max) {
                return college;
            }
        }

        return null;
    }

    public static College searchCollegeByAddress(College c[], String address) {

        for (College college : c) {
            if (college.getAddress().equalsIgnoreCase(address)) {
                return college;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        College c[] = new College[n];

        for (int i = 0; i < c.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int contactNo = sc.nextInt();
            sc.nextLine();
            String address = sc.nextLine();
            int pinCode = sc.nextInt();
            sc.nextLine();

            c[i] = new College(id, name, contactNo, address, pinCode);

        }
        
        String inputAddress = sc.nextLine();
        sc.close();
        College result1 = findCollegeWithMaximumPincode(c);

        if (result1 == null) {
            System.out.println("No college found with mentined attribute");
        } else {

            System.out.println("Id- "+result1.getId());
            System.out.println("name- "+result1.getName());
            System.out.println("contactNo- "+result1.getContactNo());
            System.out.println("address- "+result1.getAddress());
            System.out.println("pincode- "+result1.getPinCode());
        }
       
        College result2 = searchCollegeByAddress(c, inputAddress);

        if (result2 == null) {
            System.out.println("No college found with mentioned attribute");
        } else {
            System.out.println("Id- "+result2.getId());
            System.out.println("name- "+result2.getName());
            System.out.println("contactNo- "+result2.getContactNo());
            System.out.println("address- "+result2.getAddress());
            System.out.println("pincode- "+result2.getPinCode());
        }

    }
}
