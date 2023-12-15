package methodsTrainign;

import java.util.Scanner;

public class MoreEx2CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double x1y1 = pointDistance(x1, y1);
        double x2y2 = pointDistance(x2, y2);

        if (x1y1 > x2y2){
            System.out.printf("(%.0f, %.0f)", x2, y2);
        } else {
            System.out.printf("(%.0f, %.0f)", x1, y1);
        }


    }

    public static double pointDistance(double x, double y) {

        double xAbsolute = Math.abs(x);
        double yAbsolute = Math.abs(y);

        double xyPow = Math.pow(x, 2) + Math.pow(y, 2);

        return Math.sqrt(xyPow);

    }
}
