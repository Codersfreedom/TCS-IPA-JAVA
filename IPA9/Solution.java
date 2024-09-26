package IPA9;

import java.util.Arrays;
import java.util.Scanner;

class Book {
    private int id;
    private int pages;
    private String title;
    private String author;
    private double price;

    Book(int id, int pages, String title, String author, double price) {
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;

    }

    int getId() {
        return id;
    }

    double getPrice() {
        return price;
    }

    String getBookTitle() {
        return title;
    }

    int getPages() {
        return pages;
    }
}

public class Solution {

    static Book[] findBookWithMaximumPrice(Book b[]) {
        Book temp[] = new Book[0];
        double maxPrice = Integer.MIN_VALUE;
        for (Book book : b) {
            if (book.getPrice() > maxPrice) {
                maxPrice = book.getPrice();
            }
        }

        for (Book book : b) {
            if (book.getPrice() == maxPrice) {
                temp= Arrays.copyOf(temp,temp.length+1);
                temp[temp.length-1] = book;
            }
        }

       if(temp.length>0){
        return temp;
       }else{
        return null;
       }
    }

    static Book searchBookByTitle(Book b[], String title) {
        for (Book book : b) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Book b[] = new Book[4];

        for (int i = 0; i < b.length; i++) {
            int id = sc.nextInt();
            int pages = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            b[i] = new Book(id, pages, title, author, price);

        }

        String inputBookTitle = sc.nextLine();
        sc.close();

        Book result1[] = findBookWithMaximumPrice(b);

        if (result1 == null) {
            System.out.println("No Boook found with mentioned attribute");
        } else {
            for(Book res:result1){

                System.out.println(res.getId() + " " + res.getBookTitle());
            }

        }

        Book result2 = searchBookByTitle(b, inputBookTitle);

        if (result2 == null) {
            System.out.println("Not found");
        } else {
            System.out.println(result2.getId() + " " + result2.getPages());
        }
    }
}
