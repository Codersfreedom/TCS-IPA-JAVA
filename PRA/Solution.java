import java.util.Arrays;
import java.util.Scanner;

class Movie {
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    public Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

}

public class Solution {

    public static Movie[] getMovieByGenre(Movie[] movie, String genre) {
        Movie[] temp = new Movie[0];

        for (Movie m : movie) {
            if (m.getGenre().equalsIgnoreCase(genre)) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = m;
            }

        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie[] = new Movie[4];

        for (int i = 0; i < movie.length; i++) {
            String movieName = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt();
            sc.nextLine();

            movie[i] = new Movie(movieName, company, genre, budget);

        }

        String inputGenre = sc.nextLine();

        Movie result[] = getMovieByGenre(movie, inputGenre);

        for (Movie m : result) {
            System.out.println(m.getMovieName());
            System.out.println(m.getCompany());
            System.out.println(m.getGenre());
            System.out.println(m.getBudget());
        }
    }
}