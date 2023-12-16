package methods;

import java.util.Scanner;

public class MoreEx_05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double num3 = Double.parseDouble(scanner.nextLine());

        if(isZero(num1, num2, num3)){
            System.out.println("zero");
        } else if(isNegative(num1, num2, num3)){
            System.out.println("negative");
        } else if(isPositive(num1, num2, num3)){
            System.out.println("positive");
        }
    }

    private static boolean isZero(double num1, double num2, double num3) {

        boolean isValid = false;

        if (num1 == 0 || num2 == 0 || num3 ==0){
            isValid = true;
        }
        return isValid;
    }

    private static boolean isNegative(double number1, double number2, double number3) {

        boolean isValid = false;

        int negativeNumbersCount = 0;

        if (number1 != 0 && number2 != 0 && number3 != 0) {
            if(number1 < 0){
                negativeNumbersCount += 1;
            }
            if (number2 < 0){
                negativeNumbersCount += 1;
            }
            if (number3 < 0){
                negativeNumbersCount += 1;
            }
        }
        if (negativeNumbersCount % 2 != 0) {
            isValid = true;
        }
        return isValid;
    }

    private static boolean isPositive(double n1, double n2, double n3) {

        boolean isValid = false;

        int negativeNumbersCount = 0;

        if(n1 < 0){
            negativeNumbersCount += 1;
        }
        if (n2 < 0){
            negativeNumbersCount += 1;
        }
        if (n3 < 0){
            negativeNumbersCount += 1;
        }

        if (negativeNumbersCount % 2 == 0){
            isValid = true;
        }
        return isValid;
    }

}
