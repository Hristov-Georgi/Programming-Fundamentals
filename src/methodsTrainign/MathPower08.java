package methodsTrainign;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");

        double result = risedNumber(number, power);

        System.out.println(df.format(result));

    }

    private static double risedNumber(double num,int power) {

        double result = 1;

        for (int i = 1; i <= power ; i++) {

            result = result * num;

        }

        return result;
    }
}
