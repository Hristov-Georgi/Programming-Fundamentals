package Maps_Lambda_StreamApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex7LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            Map<String, Integer> keyItems = new LinkedHashMap<>();
            keyItems.put("shards", 0);
            keyItems.put("fragments", 0);
            keyItems.put("motes", 0);

            Map<String, Integer> junkItems = new LinkedHashMap<>();

            boolean isWin = false;

        while (!isWin) {

            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");

            for (int i = 0; i <= inputArr.length - 1; i += 2) {
                int itemQuantity = Integer.parseInt(inputArr[i]);
                String itemName = inputArr[i + 1].toLowerCase();

                if (itemName.equals("shards") || itemName.equals("fragments") || itemName.equals("motes")) {
                    int materialQuantity = keyItems.get(itemName);
                    keyItems.put(itemName, materialQuantity + itemQuantity);

                } else {

                    if (!junkItems.containsKey(itemName)) {
                        junkItems.put(itemName, itemQuantity);

                    } else {

                        int junkItemQuantity = junkItems.get(itemName);
                        junkItems.put(itemName, junkItemQuantity + itemQuantity);

                    }

                }


                if (keyItems.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    keyItems.put("shards", keyItems.get("shards") - 250);
                    isWin = true;
                    break;

                } else if (keyItems.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    keyItems.put("fragments", keyItems.get("fragments") - 250);
                    isWin = true;
                    break;

                } else if (keyItems.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    keyItems.put("motes", keyItems.get("motes") - 250);
                    isWin = true;
                    break;
                }

            }

            if (isWin){
                break;
            }


        }

        keyItems.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        junkItems.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }
}
