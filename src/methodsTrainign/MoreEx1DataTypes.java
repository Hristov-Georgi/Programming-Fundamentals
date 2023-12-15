package methodsTrainign;

import java.util.Scanner;

public class MoreEx1DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int numInteger = Integer.parseInt(scanner.nextLine());
                printResult(numInteger);
                break;

            case "real":
                double numDouble = Double.parseDouble(scanner.nextLine());
                printResult(numDouble);
                break;

            case "string":
                String text = scanner.nextLine();
                printResult(text);
                break;
        }
    }

    private static void printResult(int num) {

        int result = num * 2;
        System.out.println(result);
    }

    private static void printResult(double number) {

        double result = number * 1.5;
        System.out.printf("%.2f", result);
    }

    private static void printResult(String text) {

        System.out.println("$" + text + "$");
    }
}
