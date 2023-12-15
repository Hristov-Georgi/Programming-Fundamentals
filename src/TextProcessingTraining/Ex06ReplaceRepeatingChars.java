package TextProcessingTraining;

import java.util.Scanner;

public class Ex06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(resultString(input));
    }

    public static StringBuilder resultString (String input) {

        StringBuilder stringBuilder = new StringBuilder();
        char oldChar = input.charAt(0);
        stringBuilder.append(oldChar);

        for (int i = 1; i <= input.length() -1; i++) {
            if(input.charAt(i) != oldChar) {
                oldChar = input.charAt(i);
                stringBuilder.append(oldChar);
            }
        }
        return stringBuilder;
    }
}
