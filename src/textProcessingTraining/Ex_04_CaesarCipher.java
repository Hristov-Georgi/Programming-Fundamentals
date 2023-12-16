package textProcessingTraining;

import java.util.Scanner;

public class Ex_04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (char character: textInput.toCharArray()) {

            char encryptedChar = (char) (character + 3);
            encryptedText.append(encryptedChar);
        }
        System.out.println(encryptedText);
    }
}
