package textProcessingLab;

import java.util.Scanner;

public class TextFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(",\\s+");

        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
             text = text.replace(bannedWord, replacedWord("*", bannedWord.length()));

        }

        System.out.println(text);
    }

    public static String replacedWord (String symbol, int repeat){

         String result = "";
        for (int i = 0; i < repeat; i++) {
            result += symbol;
        }

        return result;
    }
}
