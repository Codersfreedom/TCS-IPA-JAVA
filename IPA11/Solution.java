package IPA11;

import java.util.Scanner;

class Player {
    private int playerId;
    private String skill;
    private String level;
    private int points;

    Player(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    int getPlayerId() {
        return playerId;
    }

    String getSkill() {
        return skill;
    }

    String getLevel() {
        return level;
    }

    int getPoints() {
        return points;
    }
}

public class Solution {

    static int findPointsForGivenSkill(Player p[], String skill) {
        int sum = 0;
        for (Player player : p) {
            if (player.getSkill().equalsIgnoreCase(skill)) {
                sum += player.getPoints();
            }
        }

        if (sum > 0) {
            return sum;
        } else {
            return 0;
        }
    }

    static Player getPlayerBasedOnLevel(Player p[], String level, String skill) {

        for (Player player : p) {
            if (player.getLevel().equalsIgnoreCase(level) && player.getSkill().equalsIgnoreCase(skill)
                    && player.getPoints() >= 20) {
                return player;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Player p[] = new Player[4];

        for (int i = 0; i < p.length; i++) {
            int playerId = sc.nextInt();
            sc.nextLine();
            String skill = sc.nextLine();
            String level = sc.nextLine();
            int points = sc.nextInt();
            sc.nextLine();

            p[i] = new Player(playerId, skill, level, points);
        }

        String inputSkill = sc.nextLine();
        String inputLevel = sc.nextLine();

        int points = findPointsForGivenSkill(p, inputSkill);
        if (points == 0) {
            System.out.println("The given Skill is not available");
        } else {
            System.out.println(points);
        }

        Player result = getPlayerBasedOnLevel(p, inputLevel, inputSkill);

        if (result == null) {
            System.out.println("No player is available with specified level, skill and eligibility points");
        } else {
            System.out.println(result.getPlayerId());
        }
    }
}
