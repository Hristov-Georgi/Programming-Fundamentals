package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String result = "";

        char oldLetter = input.charAt(0);

        for (int i = 0; i < input.length(); i++) {

            char currentLetter = input.charAt(i);

            if (oldLetter != currentLetter){
                result += oldLetter;
                oldLetter = currentLetter;
            }
        }
        result += oldLetter;
        System.out.println(result);
    }
}
