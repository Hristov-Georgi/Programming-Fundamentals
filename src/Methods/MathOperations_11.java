package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println(df.format(result(firstNum, operator, secondNum)));


    }

    public static double result(int firstNum, char operator, int secondNum) {

        double result = 0;
        switch (operator) {
            case '/':

                result = firstNum / secondNum;

                break;
            case '*':

                result = firstNum * secondNum;

                break;
            case '+':

                result = firstNum + secondNum;

                break;
            case '-':

                result = firstNum - secondNum;

                break;
        }

        return result;

    }
}
