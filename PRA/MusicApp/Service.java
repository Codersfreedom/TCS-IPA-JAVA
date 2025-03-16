package MusicApp;

import java.util.Arrays;
import java.util.Scanner;

class MusicApp {
    private int appId;
    private String appName;
    private int appSubscription;
    private Song songs[];

    public MusicApp(int appId, String appName, int appSubscription, Song[] songs) {
        this.appId = appId;
        this.appName = appName;
        this.appSubscription = appSubscription;
        this.songs = songs;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppSubscription() {
        return appSubscription;
    }

    public void setAppSubscription(int appSubscription) {
        this.appSubscription = appSubscription;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

}

class Song {
    private int songId;
    private String songName;
    private String singerName;
    private int songViews;

    public Song(int songId, String songName, String singerName, int songViews) {
        this.songId = songId;
        this.songName = songName;
        this.singerName = singerName;
        this.songViews = songViews;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getSongViews() {
        return songViews;
    }

    public void setSongViews(int songViews) {
        this.songViews = songViews;
    }

}

public class Service {

    static int CalulateAverageViewBySingerName(MusicApp musicApp[], String singerName) {
        int total = 0;
        int count = 0;

        for (MusicApp mp : musicApp) {
            for (Song s : mp.getSongs()) {
                if (s.getSingerName().equalsIgnoreCase(singerName)) {
                    total = s.getSongViews();
                    count++;
                }
            }
        }

        if (total > 0) {
            return total / count;

        } else {
            return 0;
        }
    }

    public static void findmusicAppOfSongsBySongName(MusicApp musicApps[], String songName) {
        boolean flag = false;
        String appNames[] = new String[0];

        for (MusicApp mp : musicApps) {
            for (Song s : mp.getSongs()) {
                if (s.getSongName().equalsIgnoreCase(songName)) {
                    appNames = Arrays.copyOf(appNames, appNames.length + 1);
                    appNames[appNames.length - 1] = mp.getAppName();
                    flag = true;
                }
            }

        }
        if (flag) {

            System.out.println("Song is present in : " + appNames.toString());
        } else {
            System.out.println("Song is not present");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of music apps

        MusicApp musicApp[] = new MusicApp[n];

        for (int i = 0; i < n; i++) {

            int appId = sc.nextInt(); //app id
            sc.nextLine();
            String appName = sc.nextLine(); //app name
            int appSubscription = sc.nextInt(); //subscription fees
            int numberOfSongs = sc.nextInt(); // number of songs

            Song song[] = new Song[numberOfSongs];

            for (int j = 0; j < numberOfSongs; j++) {
                int songId = sc.nextInt(); // song id
                sc.nextLine();
                String songName = sc.nextLine(); // song name
                String singerName = sc.nextLine(); // singer name
                int songViews = sc.nextInt(); // views
                // sc.nextLine();

                song[j] = new Song(songId, songName, singerName, songViews);

            }

            musicApp[i] = new MusicApp(appId, appName, appSubscription, song);
        }

        String SingerName = sc.nextLine();
        String SongName = sc.nextLine();

        int result1 = CalulateAverageViewBySingerName(musicApp, SingerName);
        if (result1 == 0)
            System.out.println("No average by this singer");
        else
            System.out.println(result1);

        findmusicAppOfSongsBySongName(musicApp, SongName);
    }
}
