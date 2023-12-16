package methods;

import java.util.Scanner;

public class Ex_06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);

    }

    public static void printMiddleCharacter(String inputText) {

        int halfTextLength = inputText.length() / 2;

        if(inputText.length() % 2 == 0)  {

            char firstChar = inputText.charAt(halfTextLength - 1);
            char secondChar = inputText.charAt(halfTextLength);

            System.out.println("" + firstChar + secondChar);

        } else {

            char middleChar = inputText.charAt(halfTextLength);

            System.out.println(middleChar);
        }
    }
}
