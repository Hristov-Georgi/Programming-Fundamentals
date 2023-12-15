package methodsTrainign;

import java.util.Scanner;

public class Ex02VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        printVowelsCount(word);

    }

    public static void printVowelsCount(String text) {

        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char singleChar = text.charAt(i);

            if(singleChar == 'A'
                    || singleChar == 'a'
                    || singleChar == 'E'
                    || singleChar == 'e'
                    || singleChar == 'U'
                    || singleChar == 'u'
                    || singleChar == 'O'
                    || singleChar == 'o'
                    || singleChar == 'I'
                    || singleChar == 'i') {

                vowelCount ++;

            }
        }

        System.out.println(vowelCount);
    }
}
