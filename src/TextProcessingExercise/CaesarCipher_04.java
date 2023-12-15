package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] text = scanner.nextLine().toCharArray();

        StringBuilder encryptedText = new StringBuilder();

        for (char symbols : text) {

            char encryptedSymbol = (char)(symbols + 3);

            encryptedText.append(encryptedSymbol);


        }

        System.out.println(encryptedText);




    }
}
