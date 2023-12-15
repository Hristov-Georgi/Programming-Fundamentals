package methodsExercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);


    }

    public static void printMiddleCharacter (String text){

        if (text.length() % 2 == 1) {

            int indexMidChar = text.length() / 2;

            System.out.println(text.charAt(indexMidChar));



        }else{
            int indexFirstMidChar = text.length() / 2 - 1;
            int indexSecondMidChar = text.length() / 2;

            System.out.println("" + text.charAt(indexFirstMidChar) + text.charAt(indexSecondMidChar));

            //при два символа не дава текст. Текст + символ = текст и като се добави другия символ също остава текст.
            // Тескт + нещо друго -> връща текст.


        }

        }

}
