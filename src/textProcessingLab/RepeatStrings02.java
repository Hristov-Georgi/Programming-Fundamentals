package textProcessingLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];

            int length = currentWord.length();

           String repeatWord = concatenatedString(currentWord, length);
           wordList.add(repeatWord);

        }

        System.out.println(String.join("", wordList));

    }

    public static String concatenatedString(String word, int length){

        String repeatString = "";

        for (int i = 0; i < length; i++) {
            repeatString = repeatString + word;
        }
        return repeatString;
    }


}
