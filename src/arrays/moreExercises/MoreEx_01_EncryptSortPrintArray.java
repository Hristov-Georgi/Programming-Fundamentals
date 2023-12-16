package arrays.moreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MoreEx_01_EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stringCount = Integer.parseInt(scanner.nextLine());

        int[] codeResult = new int[stringCount];

        for (int i = 1; i <= stringCount; i++) {

            String inputData = scanner.nextLine();

            int vowelCount = 0;
            int consonantCount = 0;

            char[] vowels = {'A', 'a', 'E', 'e', 'U', 'u', 'I', 'i', 'O', 'o'};

            for (int j = 0; j < inputData.length(); j++) {

                char currentChar = inputData.charAt(j);

                int asciiCode = currentChar;

                if (currentChar == 'A' || currentChar == 'a'
                        || currentChar == 'E'
                        || currentChar == 'e'
                        || currentChar == 'U'
                        || currentChar == 'u'
                        || currentChar == 'I'
                        || currentChar == 'i'
                        || currentChar == 'O'
                        || currentChar == 'o') {

                    vowelCount += asciiCode * inputData.length();

                } else {

                    consonantCount += (int) currentChar / inputData.length();

                }

            }

            codeResult[i - 1] = vowelCount + consonantCount;

        }

        Arrays.sort(codeResult);

        for (int i = 0; i < codeResult.length; i++) {

            System.out.println(codeResult[i]);
        }


    }
}
