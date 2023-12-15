package Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName = scanner.nextLine();
        double productQuantity = Double.parseDouble(scanner.nextLine());

        switch (productName){
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

    public static void coffeePrice (double quantity){
        double coffeePrice = quantity * 1.50;
        System.out.printf("%.2f", coffeePrice);
    }

    public static void waterPrice (double quantity){
        System.out.printf("%.2f", quantity);
    }

    public static void cokePrice (double quantity){
        double cokePrice = quantity * 1.40;
        System.out.printf("%.2f", cokePrice);
    }

    public static void snacksPrice (double quantity){
        double snacksPrice = quantity * 2.00;
        System.out.printf("%.2f", snacksPrice);
    }
}



