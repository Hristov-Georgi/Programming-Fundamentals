package finalExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> plantRarityMap = new HashMap<>();

        Map<String, Double> plantRatingMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plantRarity = scanner.nextLine().split("<->");
            String plant = plantRarity[0];
            Double rarity = Double.parseDouble(plantRarity[1]);

            plantRarityMap.put(plant, rarity);
            plantRatingMap.put(plant, 0.0);

        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {

            String[] commandsArr = input.split("[: -]+");
            String command = commandsArr[0];
            String plant = commandsArr[1];

            if (!plantRarityMap.containsKey(plant)) {
                System.out.println("error");

            } else {

                switch (command) {
                    case "Rate":
                        Double rating = Double.parseDouble(commandsArr[2]);

                        if(plantRatingMap.get(plant) == 0){
                            plantRatingMap.put(plant, rating);

                        } else {
                            Double ratingToAdd = (plantRatingMap.get(plant) + rating) / 2;
                            plantRatingMap.put(plant, ratingToAdd);
                        }

                        break;

                    case "Update":
                        Double rarity = Double.parseDouble(commandsArr[2]);
                        plantRarityMap.put(plant, rarity);

                        break;

                    case "Reset":
                        plantRatingMap.put(plant, 0.0);

                        break;
                }

            }
            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Double> entry : plantRarityMap.entrySet()) {
            System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n",
                    entry.getKey(), entry.getValue(), plantRatingMap.get(entry.getKey()));
        }
    }
}

