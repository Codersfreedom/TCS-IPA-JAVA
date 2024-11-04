package IPA37;

import java.util.Arrays;
import java.util.Scanner;

class Song {
    private int songId;
    private String title;
    private String artist;
    private double duration;

    Song(int songId, String title, String artist, double duration) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    public int getSongId() {
        return songId;
    }

    public String getTitle() {
        return title;
    }

}

public class Solution {

    static double findSongDurationForArtist(Song song[], String artist) {
        double sum = 0;

        for (Song s : song) {
            if (s.getArtist().equalsIgnoreCase(artist)) {
                sum += s.getDuration();
            }
        }

        return sum;
    }

    static Song[] getSongsInAscendingOrder(Song song[], String artist) {
        Song temp[] = new Song[0];

        for (Song s : song) {
            if (s.getArtist().equalsIgnoreCase(artist)) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = s;
            }
        }

        if (temp.length == 0) {
            return null;
        }

        Arrays.sort(temp, (a, b) -> (int) (a.getDuration()) - (int) (b.getDuration()));

        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Song song[] = new Song[5];

        for (int i = 0; i < song.length; i++) {
            int songId = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String artist = sc.nextLine();
            double duration = sc.nextDouble();
            sc.nextLine();
            song[i] = new Song(songId, title, artist, duration);
        }

        String inputArtist1 = sc.nextLine();
        String inputArtist2 = sc.nextLine();

        double result1 = findSongDurationForArtist(song, inputArtist1);

        if (result1 == 0) {
            System.out.println("There are no songs with given artist.");
        } else {
            System.out.println(result1);
        }

        Song result2[] = getSongsInAscendingOrder(song, inputArtist2);

        if (result2 == null) {
            System.out.println("There are no songs with given artist.");
        } else {
            for (Song s : result2) {
                System.out.println(s.getSongId() + ":" + s.getTitle());
            }
        }
    }

}