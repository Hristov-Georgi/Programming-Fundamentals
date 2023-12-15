package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class demo_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensedArr = new int[numArr.length - 1];


    }
}
