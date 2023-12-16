package textProcessingTraining;

import java.util.Scanner;

public class Lab_05_DigitsLettersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] inputChar = input.toCharArray();

        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder otherChars = new StringBuilder();

        for (int i = 0; i < inputChar.length; i++) {

            if(Character.isLetter(inputChar[i])) {
                letters.append(inputChar[i]);
            } else if(Character.isDigit(inputChar[i])){
                numbers.append(inputChar[i]);
            } else {
                otherChars.append(inputChar[i]);
            }

        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(otherChars);
    }
}
