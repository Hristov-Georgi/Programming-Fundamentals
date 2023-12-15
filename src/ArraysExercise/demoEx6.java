package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class demoEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;

        for (int i = 0; i <= inputArr.length - 1 ; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int left = 0; left < i; left++) {
                leftSum += inputArr[left];

            }
            for (int right = i + 1; right < inputArr.length ; right++) {
                rightSum += inputArr[right];

            }

            if (leftSum == rightSum){
                System.out.println(i);
                isFound = true;
                break;
            }

        }

        if (!isFound){
            System.out.println("no");
        }
    }
}
