package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++) {

            int currentIndex = array[i];

            for (int nextIndex = i + 1; nextIndex < array.length; nextIndex++) {

                int nextNum = array[nextIndex];
                if (currentIndex + nextNum == magicNum) {
                    System.out.println(currentIndex + " " + nextNum);

                }

            }

        }

    }
}
