package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multiplyOfOddAndEvenDigits(number));


    }

    public static int multiplyOfOddAndEvenDigits (int number){
        int evenSum = 0;
        int oddSum = 0;
        while (number > 0){
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                evenSum += lastDigit;
            }else{
                oddSum += lastDigit;
            }

            number = number / 10;
        }

        return evenSum * oddSum;
    }
}
