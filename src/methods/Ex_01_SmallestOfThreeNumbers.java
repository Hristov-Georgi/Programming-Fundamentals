package methods;

import java.util.Scanner;

public class Ex_01_SmallestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(num1, num2, num3);

    }

    public static void printSmallestNumber(int number1, int number2, int number3) {

        int smallestNum = 0;

        if (number1 >= number2) {

            smallestNum = Math.min(number2, number3);

        } else {

            smallestNum = Math.min(number1, number3);
        }

        System.out.println(smallestNum);

    }
}
