package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab_04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] commands = scanner.nextLine().split(" ");

        while(!commands[0].equals("end")){

            switch (commands[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(commands[1]);
                    numbersList.add(numToAdd);
                    break;

                case "Remove":
                    int numToRemove = Integer.parseInt(commands[1]);
                    numbersList.remove(Integer.valueOf(numToRemove));
                    break;

                case "RemoveAt":
                    int numRemoveAt = Integer.parseInt(commands[1]);
                    numbersList.remove(numRemoveAt);
                    break;

                case "Insert":
                    int numToInsert = Integer.parseInt(commands[1]);
                    int index = Integer.parseInt(commands[2]);
                    numbersList.add(index, numToInsert);
                    break;
            }
            commands = scanner.nextLine().split(" ");
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
