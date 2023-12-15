package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        String firstInput = inputArr[0];
        String secondInput = inputArr[1];

        Integer sum = firstAndSecondInputSums(firstInput, secondInput);

        System.out.println(sum);


    }

    private static Integer firstAndSecondInputSums (String firstInput, String secondInput){

        char[] firstInputArr = firstInput.toCharArray();
        char[] secondInputArr = secondInput.toCharArray();

        int minimumLength = Math.min(firstInputArr.length, secondInputArr.length);
        int maximumLength = Math.max(firstInputArr.length, secondInputArr.length);

        int summary = 0;

        for (int i = 0; i < minimumLength; i++) {
            summary += firstInputArr[i] * secondInputArr[i];
        }

        if(maximumLength == firstInputArr.length){

            for (int i = minimumLength; i < maximumLength ; i++) {

                summary += firstInputArr[i];
            }
        } else {
            for (int i = minimumLength; i < maximumLength ; i++) {
                summary += secondInputArr[i];
            }

        }

        return summary;

    }
}
