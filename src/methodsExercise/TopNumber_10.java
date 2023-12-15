package methodsExercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {
            if(isSumOfDigitsDivisibleBy8(i) && isAtLeastOneOddDigit(i)){
                System.out.println(i);
            }

        }
    }

    public static boolean isSumOfDigitsDivisibleBy8 (int n){

        int digitsSum = 0;
        while (n > 0){

            int lastDigit = n % 10;

            digitsSum += lastDigit;

            n = n / 10;

        }
        return digitsSum % 8 == 0;
    }

    public static boolean isAtLeastOneOddDigit (int n){



        while (n > 0){
            int lastDigit = n % 10;

            if(lastDigit % 2 != 0){
                return true;
            }else{
                n = n / 10;
            }

        }

        return false;
    }
}
