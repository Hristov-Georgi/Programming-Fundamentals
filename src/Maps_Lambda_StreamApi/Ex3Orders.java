package Maps_Lambda_StreamApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productAndPrice = new LinkedHashMap<>();
        Map<String, Integer> productAndQuantity = new LinkedHashMap<>();

        String productInformation = scanner.nextLine();

        while (!productInformation.equals("buy")){

            String product = productInformation.split(" ")[0];
            double price = Double.parseDouble(productInformation.split(" ")[1]);
            int quantity = Integer.parseInt(productInformation.split(" ")[2]);

            productAndPrice.put(product, price);

            if(!productAndQuantity.containsKey(product)){
                productAndQuantity.put(product, quantity);
            } else {
                productAndQuantity.put(product, productAndQuantity.get(product) + quantity);
            }

            productInformation = scanner.nextLine();
        }

        for(Map.Entry<String, Double> entry : productAndPrice.entrySet()){

            double totalPrice = entry.getValue() * productAndQuantity.get(entry.getKey());

            System.out.printf("%s -> %.2f%n", entry.getKey(), totalPrice);
        }


    }
}
