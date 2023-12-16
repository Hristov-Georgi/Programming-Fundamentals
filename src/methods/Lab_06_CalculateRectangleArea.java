package methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstSide = Double.parseDouble(scanner.nextLine());
        double secondSide = Double.parseDouble(scanner.nextLine());

        double area = rectangleArea(firstSide, secondSide);

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println(df.format(area));

    }

    public static double rectangleArea(double side1, double side2) {

        return side1 * side2;
    }
}
