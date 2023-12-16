package methods;

import java.util.Scanner;

public class Lab_05_Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String productInfo = scanner.nextLine();
        int productQuantity = Integer.parseInt(scanner.nextLine());

        switch (productInfo) {

            case "coffee":
                coffeePrice(productQuantity);
                break;

            case "water":
                waterPrice(productQuantity);
                break;

            case "coke":
                cokePrice(productQuantity);
                break;

            case "snacks":
                snacksPrice(productQuantity);
                break;

        }
    }

    public static void coffeePrice (int quantity) {

        double price = quantity * 1.50;
        System.out.printf("%.2f", price);
    }

    public static void waterPrice(int quantity) {

        double price = quantity * 1.00;
        System.out.printf("%.2f", price);
    }

    public static void cokePrice(int quantity) {

        double price = quantity * 1.40;
        System.out.printf("%.2f", price);
    }

    public static void snacksPrice(int quantity) {

        double price = quantity * 2.00;
        System.out.printf("%.2f", price);
    }
}
