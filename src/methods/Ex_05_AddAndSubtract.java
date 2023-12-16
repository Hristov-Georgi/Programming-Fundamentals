package methods;

import java.util.Scanner;

public class Ex_05_AddAndSubtract {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sum = sumNumbers(num1, num2);
        int result = subtractNumbers(sum, num3);

        System.out.println(result);

    }

    public static int sumNumbers(int number1, int number2) {

        return number1 + number2;
    }

    public static int subtractNumbers(int numSum, int number3) {

        return numSum - number3;
    }
}
