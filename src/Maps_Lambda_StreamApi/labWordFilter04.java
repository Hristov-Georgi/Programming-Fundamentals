package Maps_Lambda_StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class labWordFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");


        for (String word : input){

            if (word.length() % 2 == 0){

                System.out.println(word);
            }
        }



//        String[] input = Arrays.stream(scanner.nextLine().split(" "))
//                .filter(w -> w.length() % 2 == 0)
//                .toArray(String[]::new);
//
//        for(String word : input){
//            System.out.println(String.join("", word));
//        }
    }
}
