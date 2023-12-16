package textProcessingTraining;

import java.util.Scanner;

public class Lab_04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        String text = scanner.nextLine();

        String[] bannedWords = words.split(", ");

        for (int i = 0; i < bannedWords.length ; i++) {

            text = text.replaceAll(bannedWords[i], "*".repeat(bannedWords[i].length()));

        }

        System.out.println(text);
    }
}
