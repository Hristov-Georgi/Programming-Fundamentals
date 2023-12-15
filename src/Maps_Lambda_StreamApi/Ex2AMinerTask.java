package Maps_Lambda_StreamApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        Map<String, Integer> resourceQuantity = new LinkedHashMap<>();

        while (!resource.equals("stop")){

            int quantity = Integer.parseInt(scanner.nextLine());

            if(!resourceQuantity.containsKey(resource)){
                resourceQuantity.put(resource, quantity);
            } else {
                resourceQuantity.put(resource, resourceQuantity.get(resource) + quantity);
            }

            resource = scanner.nextLine();
        }
        // два примера за печат
        //resourcesQuantity.forEach((key, value) -> System.out.println(key + " -> " + value));
        //resourcesQuantity.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        for (Map.Entry<String, Integer> entry : resourceQuantity.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
