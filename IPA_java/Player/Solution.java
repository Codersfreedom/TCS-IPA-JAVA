package IPA_java.Player;

import java.util.Arrays;
import java.util.Scanner;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public String getMatchType() {
        return this.matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerType() {
        return playerType;
    }

    public int getRuns() {
        return runs;
    }
}

public class Solution {
    static int findPlayerWithLowestRuns(Player player[], String playerType) {
        int lowest = Integer.MAX_VALUE;

        for (Player p : player) {
            if (p.getPlayerType().equalsIgnoreCase(playerType) && p.getRuns() < lowest) {
                lowest = p.getRuns();
            }

        }

        return lowest;
    }

    static Player[] findPlayerByMatchType(Player player[], String matchType) {
        Player temp[] = new Player[0];

        for (int i = 0; i < player.length; i++) {

            System.out.println(player[i].getMatchType().equalsIgnoreCase(matchType));
            if (player[i].getMatchType().equalsIgnoreCase(matchType)) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = player[i];
            }

        }

        if (temp.length > 0) {
            Arrays.sort(temp, (a, b) -> b.getPlayerId() - a.getPlayerId());
            return temp;
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player player[] = new Player[4];

        for (int i = 0; i < player.length; i++) {
            int playerId = sc.nextInt();
            sc.nextLine();
            String playerName = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            player[i] = new Player(playerId, playerName, runs, playerType, matchType);

        }

        String inputPlayerType = sc.nextLine();
        String inputMatchType = sc.nextLine();

        // for (Player p : player) {
        // System.out.println(p.getPlayerId()+": " +p.getMatchType());
        // }
        // int runs = findPlayerWithLowestRuns(player, inputPlayerType);

        // if (runs == Integer.MAX_VALUE) {
        // System.out.println("No player with lowest runs");
        // } else {
        // System.out.println(runs);
        // }

        Player result[] = findPlayerByMatchType(player, inputMatchType);

        if (result == null) {
            System.out.println("No player with such matchType");
        } else {
            for (Player p : result) {
                System.out.println(p.getPlayerId());
            }
        }

    }
}
