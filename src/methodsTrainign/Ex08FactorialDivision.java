package methodsTrainign;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long first = NumFactorial(firstNumber);
        long second = NumFactorial(secondNumber);

        double result = 1.0 * first / second ;

        System.out.printf("%.2f", result);


    }

    public static long NumFactorial(int number) {

        long factorialSum = 1;

        for (int i = number; i >= 1; i--) {

            factorialSum = factorialSum * i;

        }

        return factorialSum;
    }


}
