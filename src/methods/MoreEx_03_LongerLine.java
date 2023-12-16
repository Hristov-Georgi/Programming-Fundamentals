package methods;

import java.util.Scanner;

public class MoreEx_03_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());   //firstPairLine
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());   //secondPairLine
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());

        double firstPairLine = findLongerLine(x1,y1,x2,y2);
        double secondPairLine = findLongerLine(x3,y3,x4,y4);

        double x1y1 = pointDistance(x1, y1);
        double x2y2 = pointDistance(x2, y2);
        double x3y3 = pointDistance(x3, y3);
        double x4y4 = pointDistance(x4, y4);

        if(firstPairLine >= secondPairLine) {
            if (x1y1 > x2y2){
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
            }
        } else {
            if (x3y3 > x4y4) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x4, y4, x3, y3);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3, x4, y4);

            }
        }
    }

    public static double findLongerLine(double x1, double y1, double x2, double y2) {

        double x1x2 = 0;  //a
        double y1y2 = 0;  //b

        if((x1 >= 0 && x2 >= 0) || (x1 < 0 && x2 < 0)) {
            if (x1 > x2) {
                x1x2 = x1 - x2;
            } else if (x1 < x2) {
                x1x2 = x2 - x1;
            } else {
                x1x2 = x1;
            }
        } else if(x1 > 0 && x2 < 0){
            x1x2 = x1 - x2;
        } else if(x1 < 0 && x2 > 0) {
            x1x2 = x2 - x1;
        }

        if((y1 >= 0 && y2 >= 0) || (y1 < 0 && y2 < 0)) {
            if (y1 > y2) {
                y1y2 = y1 - y2;
            } else if (y1 < y2) {
                y1y2 = y2 - y1;
            } else {
                y1y2 = y1;
            }
        } else if(y1 > 0 && y2 < 0){
            y1y2 = y1 - y2;
        } else if(y1 < 0 && y2 > 0) {
            y1y2 = y2 - y1;
        }

        double cSide = Math.pow(x1x2, 2) + Math.pow(y1y2, 2);  //c
        return Math.sqrt(cSide);
    }

    public static double pointDistance(double x, double y) {

        double xAbsolute = Math.abs(x);
        double yAbsolute = Math.abs(y);

        double xyPow = Math.pow(x, 2) + Math.pow(y, 2);

        return Math.sqrt(xyPow);
    }
}
