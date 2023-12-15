package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("end")){

            String[] inputArr = input.split(" ");
            String command = inputArr[0];

            switch (command) {

                case "Add":
                    int numToAdd = Integer.parseInt(inputArr[1]);
                    numList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(inputArr[1]);
                    numList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int numToRemoveAt = Integer.parseInt(inputArr[1]);
                    numList.remove(numToRemoveAt);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(inputArr[1]);
                    int indexToInsert = Integer.parseInt(inputArr[2]);
                    numList.add(indexToInsert, numToInsert);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
