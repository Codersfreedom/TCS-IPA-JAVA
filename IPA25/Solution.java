package IPA25;

import java.util.Scanner;

class Cinema {
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    Cinema(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public String getDirector() {
        return director;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getRating() {
        return rating;
    }

}

public class Solution {

    static int findAvgBudgetByDirector(Cinema cinema[], String director) {
        int sum = 0;
        int count = 0;
        for (Cinema C : cinema) {
            if (C.getDirector().equalsIgnoreCase(director)) {
                sum += C.getBudget();
                count++;
            }
        }

        if (sum > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }

    static Cinema getMovieByRatingBudget(Cinema cinema[], int rating, int budget) {
        for (Cinema C : cinema) {
            if (C.getRating() == rating && C.getBudget() == budget && budget % rating == 0) {
                return C;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cinema cinema[] = new Cinema[4];

        for (int i = 0; i < cinema.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sc.nextLine();

            cinema[i] = new Cinema(a, b, c, d);

        }

        String director = sc.nextLine();
        int rating = sc.nextInt();
        int budget = sc.nextInt();

        sc.close();

        int result1 = findAvgBudgetByDirector(cinema, director);

        if (result1 == 0) {
            System.out.println("Sorry - The given director has not yet directed any movie");

        } else {
            System.out.println(result1);
        }

        Cinema result2 = getMovieByRatingBudget(cinema, rating, budget);
        if (result2 == null) {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        } else {

            System.out.println(result2.getMovieId());
        }

    }
}
