package ListsTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lab04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] commands = scanner.nextLine().split(" ");

        while(!commands[0].equals("end")){
            //Add {number}: add a number to the end of the list
            //Remove {number}: remove a number from the list
            //RemoveAt {index}: remove a number at a given index
            //Insert {number} {index}:

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
