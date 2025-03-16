package Player;

import java.util.Scanner;

class Player {
    private int id;
    private int matchesPlayed;
    private int totalRuns;
    private String name;
    private String team;

    public Player(int id, int matchesPlayed, int totalRuns, String name, String team) {
        this.id = id;
        this.matchesPlayed = matchesPlayed;
        this.totalRuns = totalRuns;
        this.name = name;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

}

public class Solution {

    public static double findAverageTotalRunsOfPlayer(Player player[]) {
        int count = 0;
        double total = 0;
        for (Player p : player) {
            total += p.getTotalRuns();
            count++;
        }

        return total / count;
    }

    public static Player findPlayerWithMinimumMatchesPlayed(Player player[]) {

        int min = Integer.MAX_VALUE;
        Player temp = null;

        for (Player p : player) {
            if (p.getMatchesPlayed() < min) {
                min = p.getMatchesPlayed();
                temp = p;
            }

        }

        if (min == Integer.MAX_VALUE) {
            System.out.println("No player found");
            return null;
        } else {
            return temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Player player[] = new Player[n];

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int matchesPlayed = sc.nextInt();
            int totalRuns = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String team = sc.nextLine();

            player[i] = new Player(id, matchesPlayed, totalRuns, name, team);
        }

        double averageTotalRuns = findAverageTotalRunsOfPlayer(player);

        if (averageTotalRuns == 0)
            System.out.println("No player found");
        else
            System.out.println(averageTotalRuns);

        Player playerWithMinimumMatchesPlayed = findPlayerWithMinimumMatchesPlayed(player);

        if (playerWithMinimumMatchesPlayed != null)
            System.out.println(playerWithMinimumMatchesPlayed.getName());
    }
}
