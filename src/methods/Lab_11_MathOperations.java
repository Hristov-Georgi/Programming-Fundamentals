package methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_11_MathOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double secondNum = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");

        switch(operator) {

            case '+':

                System.out.println(df.format(sumNumbers(firstNum, secondNum)));

                break;

            case '-':

                System.out.println(df.format(subtractNumbers(firstNum, secondNum)));

                break;

            case '/':

                System.out.println(df.format(divideNumbers(firstNum, secondNum)));

                break;

            case '*':

                System.out.println(df.format(multiplyNumbers(firstNum, secondNum)));

                break;

        }

    }

    private static double sumNumbers(double firstNum, double secondNum){

        return firstNum + secondNum;
    }

    private static double subtractNumbers (double fNum, double sNum) {

        return fNum - sNum;
    }

    private static double divideNumbers(double num1, double num2) {

        return num1 / num2;
    }

    private static double multiplyNumbers(double number1, double number2) {

        return number1 * number2;
    }
}
