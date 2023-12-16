package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex_09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distanceToPokemon = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int removedItemsSum = 0;

        while (distanceToPokemon.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int deletedItem = distanceToPokemon.get(0);
                removedItemsSum += distanceToPokemon.get(0);
                distanceToPokemon.remove(0);
                distanceToPokemon.add(0, distanceToPokemon.get(distanceToPokemon.size() - 1));
                increaseDecreaseElementsValue(distanceToPokemon, deletedItem);

            } else if (index >= distanceToPokemon.size()) {
                int removedItem = distanceToPokemon.get(distanceToPokemon.size() - 1);
                removedItemsSum += distanceToPokemon.get(distanceToPokemon.size() - 1);
                distanceToPokemon.remove(distanceToPokemon.size() - 1);
                distanceToPokemon.add(distanceToPokemon.get(0));
                increaseDecreaseElementsValue(distanceToPokemon, removedItem);

            } else {
                int indexValue = distanceToPokemon.get(index);
                removedItemsSum += indexValue;
                distanceToPokemon.remove(index);
                increaseDecreaseElementsValue(distanceToPokemon, indexValue);
            }
        }
        System.out.println(removedItemsSum);
    }

    public static void increaseDecreaseElementsValue(List<Integer> list, int itemRemoved) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) <= itemRemoved) {
                int valueSum = itemRemoved + list.get(i);
                list.set(i, valueSum);

                continue;
            }

            if (list.get(i) > itemRemoved) {
                int valueSubtract = list.get(i) - itemRemoved;
                list.set(i, valueSubtract);
            }
        }
    }
}
