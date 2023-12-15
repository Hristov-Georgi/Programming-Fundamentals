package TextProcessingTraining;

import java.util.Scanner;

public class Ex02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String firstString = input[0];
        String secondString = input[1];

        System.out.println(totalSummary(firstString, secondString));

    }

    private static int totalSummary (String firstStr, String secondStr) {
        int score = 0;

        if (firstStr.length() >= secondStr.length()) {

            for (int i = 0; i <= secondStr.length() - 1; i++) {
                score += secondStr.charAt(i) * firstStr.charAt(i);
            }
            for (int i = secondStr.length(); i <= firstStr.length() - 1 ; i++) {
                score += firstStr.charAt(i);
            }
        } else {
            for (int i = 0; i <= firstStr.length() - 1; i++) {
                score += firstStr.charAt(i) * secondStr.charAt(i);
            }

            for (int i = firstStr.length(); i <= secondStr.length() - 1 ; i++) {
                score += secondStr.charAt(i);

            }
        }
        return score;
    }
}
