package basicSyntaxConditionalStatementsLoops.exercise;

import java.util.Scanner;

public class Ex_07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double coinsSum = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                coinsSum += coins;
            } else {
                System.out.printf("Cannot accept %.02f%n", coins);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {

            if (input.equals("Nuts") && coinsSum >= 2.0) {

                System.out.printf("Purchased Nuts%n");
                coinsSum -= 2.0;

            } else if (input.equals("Nuts") && coinsSum < 2.0) {

                System.out.printf("Sorry, not enough money%n");

            } else if (input.equals("Water") && coinsSum >= 0.7) {

                System.out.printf("Purchased Water%n");
                coinsSum -= 0.7;

            } else if (input.equals("Water") && coinsSum < 0.7) {
                System.out.printf("Sorry, not enough money%n");

            } else if (input.equals("Crisps") && coinsSum >= 1.5) {
                System.out.printf("Purchased Crisps%n");
                coinsSum -= 1.5;

            } else if (input.equals("Crisps") && coinsSum < 1.5) {
                System.out.printf("Sorry, not enough money%n");

            } else if (input.equals("Soda") && coinsSum >= 0.8) {
                System.out.printf("Purchased Soda%n");
                coinsSum -= 0.8;

            } else if (input.equals("Soda") && coinsSum < 0.8) {
                System.out.printf("Sorry, not enough money%n");

            } else if (input.equals("Coke") && coinsSum >= 1.0) {
                System.out.printf("Purchased Coke%n");
                coinsSum -= 1.0;

            } else if (input.equals("Coke") && coinsSum < 1.0) {
                System.out.printf("Sorry, not enough money%n");

            } else {
                System.out.println("Invalid product");
            }

            input = scanner.nextLine();

        }

        System.out.printf("Change: %.02f", coinsSum);
    }
}
