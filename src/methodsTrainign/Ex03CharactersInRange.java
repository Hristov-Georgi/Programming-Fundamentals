package methodsTrainign;

import java.util.Scanner;

public class Ex03CharactersInRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printCharacters(firstChar, secondChar);


    }

    public static void printCharacters(char firstChar, char secondChar) {

        if (firstChar < secondChar) {


            for (int i = firstChar + 1; i < secondChar; i++) {

                String asciiToChar = Character.toString(i);

                System.out.print(asciiToChar + " ");

            }

        } else {

            for (int i = secondChar + 1; i < firstChar; i++) {

                String asciiToChar = Character.toString(i);

                System.out.print(asciiToChar + " ");
            }
        }

    }
}
