package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Double> namePriceMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> nameQuantityMap = new LinkedHashMap<>();

        String inputData = scanner.nextLine();

        while(!inputData.equals("buy")) {

            String productName = inputData.split("\\s+")[0];
            double productPrice = Double.parseDouble(inputData.split("\\s+")[1]);
            int productQuantity = Integer.parseInt(inputData.split("\\s+")[2]);

            namePriceMap.put(productName, productPrice);

            if(!nameQuantityMap.containsKey(productName)) {
                nameQuantityMap.put(productName, productQuantity);

            } else {
                nameQuantityMap.put(productName, nameQuantityMap.get(productName) + productQuantity);
            }

            inputData = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : namePriceMap.entrySet()){

            double value = entry.getValue() * nameQuantityMap.get(entry.getKey());

            System.out.printf("%s -> %.2f%n", entry.getKey(), value);
        }
    }
}
