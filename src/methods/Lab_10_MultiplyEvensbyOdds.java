package methods;

import java.util.Scanner;

public class Lab_10_MultiplyEvensbyOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        System.out.println(sumOfEvenAndOddDigits(number));

    }

    public static int sumOfEvenAndOddDigits(int num) {

        int evenSum = 0;
        int oddSum = 0;

        int number = Math.abs(num);

        while (number > 0) {

            int lastDigit = number % 10;

            if(lastDigit % 2 != 0) {
                oddSum += lastDigit;
            } else {
                evenSum += lastDigit;
            }

            number = number / 10;
        }

        return evenSum * oddSum;
    }
}
