package TheatreManagement;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static int getTheatreCapacity(Theatre theatres[], int theatreNumber) {
        for (Theatre theatre : theatres) {
            if (theatre.getTheatreNumber() == theatreNumber) {
                return theatre.getTheatreCapacity();
            }
        }
        return 0;
    }

    public static Theatre getSecond(Theatre theatres[], String theatreType) {
        Theatre temp[] = new Theatre[0];

        for (Theatre theatre : theatres) {
            if (theatre.getTheatreType().equalsIgnoreCase(theatreType)) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = theatre;
            }

            
        }
        if (temp.length > 0) {
            Arrays.sort(temp, (a, b) -> a.getTheatreRating() - b.getTheatreRating());
            return temp[temp.length - 2];
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Theatre theatres[] = new Theatre[4];

        for (int i = 0; i < theatres.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int theatreCapacity = sc.nextInt();
            int theatreRating = sc.nextInt();
            sc.nextLine();
            String theatreType = sc.nextLine();

            theatres[i] = new Theatre(id, name, theatreCapacity, theatreRating, theatreType);
        }

        int theatreNumber = sc.nextInt();
        sc.nextLine();
        String inputTheatreType = sc.nextLine();

        int capacity = getTheatreCapacity(theatres, theatreNumber);
        if (capacity > 0) {
            System.out.println(capacity);
        } else {
            System.out.println("No thatre with this id");
        }

        Theatre theatre = getSecond(theatres, inputTheatreType);

        if (theatre != null) {
            System.out.println(theatre.getTheatreName());
            System.out.println(theatre.getTheatreRating());
        } else {
            System.out.println("No such theatre.");
        }
    }
}

class Theatre {
    private int theatreNumber;
    private String theatreName;
    private int theatreCapacity;
    private int theatreRating;
    private String theatreType;

    public Theatre(int theatreNumber, String theatreName, int theatreCapacity, int theatreRating, String theatreType) {
        this.theatreNumber = theatreNumber;
        this.theatreName = theatreName;
        this.theatreCapacity = theatreCapacity;
        this.theatreRating = theatreRating;
        this.theatreType = theatreType;
    }

    public int getTheatreNumber() {
        return theatreNumber;
    }

    public void setTheatreNumber(int theatreNumber) {
        this.theatreNumber = theatreNumber;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public int getTheatreCapacity() {
        return theatreCapacity;
    }

    public void setTheatreCapacity(int theatreCapacity) {
        this.theatreCapacity = theatreCapacity;
    }

    public int getTheatreRating() {
        return theatreRating;
    }

    public void setTheatreRating(int theatreRating) {
        this.theatreRating = theatreRating;
    }

    public String getTheatreType() {
        return theatreType;
    }

    public void setTheatreType(String theatreType) {
        this.theatreType = theatreType;
    }

}