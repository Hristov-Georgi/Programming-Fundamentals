package methods;

import java.util.Scanner;

public class Lab_01_SignOfInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        signOfInteger(num);

    }

    public static void signOfInteger(int number) {

        if (number > 0) {
            System.out.printf("The number %d is positive.", number);

        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);

        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
