package ObjectsAndClassesTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab04Songs {

    static class Song {

        private String typeList;
        private String songName;
        private String time;

        public Song(String typeList, String songName, String time){

            this.typeList = typeList;
            this.songName = songName;
            this.time = time;

        }

        public String getTypeList(){
            return this.typeList;
        }

        public String getSongName() {
            return this.songName;
        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songsList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {

            String[] songs = scanner.nextLine().split("_");

            Song currentSong = new Song(songs[0], songs[1], songs[2]);

            songsList.add(currentSong);

        }

        String whatToPrint = scanner.nextLine();

        if(whatToPrint.equals("all")) {
            for (Song item : songsList) {
                System.out.println(item.getSongName());
                
            }
        } else {
            for (Song item : songsList) {
                if(whatToPrint.equals(item.getTypeList())) {

                    System.out.println(item.getSongName());
                }
            }
        }
    }
}
