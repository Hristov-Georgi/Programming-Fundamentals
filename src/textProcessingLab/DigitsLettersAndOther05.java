package textProcessingLab;

import java.util.Scanner;

public class DigitsLettersAndOther05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder otherChar = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {

            char currentSymbol = text.charAt(i);

            if (Character.isDigit(currentSymbol)){
                digits.append(currentSymbol);
            } else if (Character.isLetter(currentSymbol)){
                letters.append(currentSymbol);
            } else {
                otherChar.append(currentSymbol);
            }


//            if (currentSymbol >= '0' && currentSymbol <= '9'){
//                digits.append(currentSymbol);
//
//            } else if ((currentSymbol >= 'A' && currentSymbol <= 'Z') || (currentSymbol >= 'a' && currentSymbol <= 'z')) {
//                letters.append(currentSymbol);
//
//            } else {
//                otherChar.append(currentSymbol);
//            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(otherChar);
    }
}
