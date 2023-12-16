package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();

        boolean isWin = false;

        while (!isWin) {

            String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length ; i+=2) {

                int quantity = Integer.parseInt(input[i]);
                String lootMaterial = input[i + 1].toLowerCase();

                if(lootMaterial.equals("shards") || lootMaterial.equals("fragments") || lootMaterial.equals("motes")) {

                    keyMaterials.put(lootMaterial, keyMaterials.get(lootMaterial) + quantity);

                    if(keyMaterials.get(lootMaterial) >= 250 && lootMaterial.equals("shards")) {
                        System.out.println("Shadowmourne obtained!");
                        keyMaterials.put("shards", keyMaterials.get("shards") - 250);
                        isWin = true;
                        break;

                    } else if (keyMaterials.get(lootMaterial) >= 250 && lootMaterial.equals("fragments")) {
                        System.out.println("Valanyr obtained!");
                        keyMaterials.put("fragments", keyMaterials.get("fragments") - 250);
                        isWin = true;
                        break;

                    } else if (keyMaterials.get(lootMaterial) >= 250 && lootMaterial.equals("motes")) {
                        System.out.println("Dragonwrath obtained!");
                        keyMaterials.put("motes", keyMaterials.get("motes") - 250);
                        isWin = true;
                        break;
                    }

                } else {

                    if(!junkItems.containsKey(lootMaterial)) {
                        junkItems.put(lootMaterial, quantity);

                    } else {
                        junkItems.put(lootMaterial, junkItems.get(lootMaterial) + quantity);
                    }
                }
            }

            if(isWin) {
                break;
            }
        }

        keyMaterials.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        junkItems.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));


    }
}
