package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_Songs_04 {


    static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song (String typeList, String name, String time){

            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
        public String getTypeList(){
            return this.typeList;
        }
        public String getName(){
            return this.name;
        }
        public String getTime(){
            return this.time;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();
        for (int i = 1; i <= numberOfSongs ; i++) {

            String[] inputSongArr = scanner.nextLine().split("_");

            Song song = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2] );

            songList.add(song);
        }

        String command = scanner.nextLine();

        if (command.equals("all")){
            for (Song item : songList) {
                System.out.println(item.getName());

            }
        } else {
            for (Song item : songList){
                if(command.equals(item.getTypeList())){
                    System.out.println(item.getName());
                }
            }
        }

    }
}
