package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class training {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenNumSum = 0;

        for (int i = 0; i < numbersArr.length; i++) {

            if (numbersArr[i] % 2 == 0){
                evenNumSum += numbersArr[i];
            }

        }
        System.out.println(evenNumSum);

    }
}
