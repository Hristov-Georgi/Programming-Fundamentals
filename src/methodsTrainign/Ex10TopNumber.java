package methodsTrainign;

import java.util.Scanner;

public class Ex10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 17; i <= n ; i++) {
            if(isDivisibleBy8(i) && isItHoldOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isDivisibleBy8(int i) {

        int sumOfDigits = 0;

        while (i > 0) {
            int lastDigit = i % 10;
            sumOfDigits += lastDigit;
            i = i / 10;
        }

        if (sumOfDigits % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isItHoldOneOddDigit (int n) {

        boolean isValid = false;

        while (n > 0) {
            int lastDigit = n % 10;

            if(lastDigit % 2 != 0){
                isValid = true;
                break;
            }
            n = n / 10;
        }
        return isValid;
    }
}
