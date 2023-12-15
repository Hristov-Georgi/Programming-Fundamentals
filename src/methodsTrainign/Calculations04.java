package methodsTrainign;

import java.util.Scanner;

public class Calculations04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputCommand = scanner.nextLine();

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (inputCommand) {

            case "add":
                addNumbers(firstNumber, secondNumber);

                break;

            case "multiply":
                multiplyNumbers(firstNumber, secondNumber);

                break;

            case "subtract":
                subtractNumbers(firstNumber, secondNumber);

                break;

            case "divide":
                divideNumbers(firstNumber, secondNumber);

                break;
        }


    }

    public static void addNumbers(int num1, int num2) {

        int result = num1 + num2;
        System.out.println(result);
    }

    public static void multiplyNumbers(int num1, int num2) {

        int result = num1 * num2;
        System.out.println(result);
    }

    public static void subtractNumbers(int num1, int num2) {

        int result = num1 - num2;
        System.out.println(result);
    }

    public static void divideNumbers(int num1, int num2) {

        int result = num1 / num2;
        System.out.println(result);
    }



}
