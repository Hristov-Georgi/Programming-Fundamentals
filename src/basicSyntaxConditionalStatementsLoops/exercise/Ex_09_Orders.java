package basicSyntaxConditionalStatementsLoops.exercise;

import java.util.Scanner;

public class Ex_09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //((daysInMonth * capsulesCount) * pricePerCapsule)   - formula

        int N = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        for (int i = 1; i <= N; i++) {

            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double coffeePrice = daysInMonth * capsulesCount * capsulePrice;

            totalPrice += coffeePrice;

            System.out.printf("The price for the coffee is: $%.2f%n", coffeePrice);

        }

        System.out.printf("Total: $%.2f", totalPrice);
    }
}
