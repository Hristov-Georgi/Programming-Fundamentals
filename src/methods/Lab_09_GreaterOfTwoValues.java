package methods;

import java.util.Scanner;

public class Lab_09_GreaterOfTwoValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        switch (inputData) {

            case "int":

                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());

                System.out.println(getMax(num1, num2));

                break;

            case "char":

                char char1 = scanner.nextLine().charAt(0);
                char char2 = scanner.nextLine().charAt(0);

                System.out.println(getMax(char1, char2));

                break;

            case "string":

                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();

                System.out.println(getMax(text1, text2));

                break;
        }
    }

    public static int getMax(int number1, int number2) {

        return Math.max(number1, number2);

    }

    public static char getMax(char symbol1, char symbol2) {

        if(symbol1 > symbol2) {
            return symbol1;
        } else {
            return symbol2;
        }
    }

    public static String getMax(String firstText, String secondText) {

        if(firstText.compareTo(secondText) > 0) {
            return firstText;
        } else {
            return secondText;
        }
    }
}
