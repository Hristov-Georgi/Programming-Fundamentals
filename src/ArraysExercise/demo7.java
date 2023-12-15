package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;


// PAK DA Q RESHAVAM !!!!!!!!!!!

public class demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int startIndex = 0;
        int bestStart = 0;

        int commonElementsLength = 1;
        int maxLength = 0;


       for (int i = 1; i < numberArr.length ; i++) {

            if (numberArr[i] == numberArr[i - 1]) {
                commonElementsLength++;

            } else {
                startIndex = i;
                commonElementsLength = 1;
            }


            if (commonElementsLength > maxLength){
                maxLength = commonElementsLength;
                bestStart = startIndex;
            }
        }

        for (int i = bestStart; i < bestStart + maxLength; i++) {
            System.out.print(numberArr[i] + " ");

        }

        // PAK DA Q RESHAVAM!!!!!!!!!!!!!!!!!!!!!!!


    }
}
