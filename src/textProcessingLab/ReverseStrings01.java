package textProcessingLab;

import java.util.Scanner;

public class ReverseStrings01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")){

            String currentWord = input;

            StringBuilder reversedWord = new StringBuilder();

            for (int i = currentWord.length() -1 ; i >= 0; i--) {
                char currentChar = currentWord.charAt(i);

                reversedWord.append(currentChar);

            }
            System.out.printf("%s = %s%n", currentWord, reversedWord);




            input = scanner.nextLine();
        }
    }
}
