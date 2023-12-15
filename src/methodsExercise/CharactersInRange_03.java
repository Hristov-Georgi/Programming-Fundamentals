package methodsExercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printCharactersInRange(firstChar, secondChar);


    }

    public static void printCharactersInRange (char firstChar, char secondChar){

        if(firstChar < secondChar) {

            for (char i = (char) (firstChar + 1); i < secondChar; i++) {

                System.out.print(i + " ");

            }
        }else if(secondChar < firstChar){

            for (char i = (char)(secondChar + 1); i < firstChar ; i++) {
                System.out.print(i + " ");

            }
        }
    }
}
