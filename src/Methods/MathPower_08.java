package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println(df.format(risedNumber(firstNum, secondNum)));


    }

    public static double risedNumber (double num1, double num2){

        return Math.pow(num1, num2);
    }
}
