package arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int item : numberArr) {

            if (item % 2 == 0) {
                evenSum += item;

            } else {
                oddSum += item;
            }
        }

        System.out.println(evenSum - oddSum);


    }
}
