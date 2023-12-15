package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double result = calculatedArea(width, length);

        DecimalFormat df = new DecimalFormat("0.#");

        System.out.println(df.format(result));


    }

    public static double calculatedArea (double width, double length){

        return width * length;
    }
}
