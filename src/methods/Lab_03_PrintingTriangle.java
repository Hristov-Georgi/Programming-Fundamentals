package methods;

import java.util.Scanner;

public class Lab_03_PrintingTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        printTriangle(inputNumber);

    }

    public static void printTriangle(int number) {

        for (int i = 1; i <= number; i++) {
            printRow(i);

        }

        for (int i = number - 1; i >= 1; i--) {
            printRow(i);

        }
    }

    public static void printRow(int num) {

        for (int i = 1; i <= num; i++) {

            System.out.print(i + " ");

        }

        System.out.println();
    }
}
