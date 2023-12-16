package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex_08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String commandsInput = scanner.nextLine();

        while(!commandsInput.equals("3:1")) {

            String[] command = commandsInput.split("\\s+");

            switch(command[0]) {
                case "merge":
                    mergeCommand(inputList, command);
                    break;

                case "divide":
                    divideCommand(inputList, command);
                    break;
            }
            commandsInput = scanner.nextLine();
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static void mergeCommand(List<String> list, String[] commands) {

        int startIndex = Integer.parseInt(commands[1]);
        int ednIndex = Integer.parseInt(commands[2]);

        if (startIndex < 0 ) {
            startIndex = 0;
        }
        if (ednIndex > list.size() - 1) {
            ednIndex = list.size() -1;
        }

        if (startIndex <= list.size() - 1 && ednIndex >= 0 && startIndex < ednIndex) {

            String mergedText = "";

            for (int i = startIndex; i <= ednIndex; i++) {
                mergedText += list.get(i);
            }
            for (int index = ednIndex; index >= startIndex; index--) {
                list.remove(index);
            }
            list.add(startIndex, mergedText);
        }
    }

    public static void divideCommand(List<String> list, String[] commands) {

        int index = Integer.parseInt(commands[1]);
        int partitions = Integer.parseInt(commands[2]);

        String element = list.get(index);
        list.remove(index);

        int numberOfPartitions = element.length() / partitions;

        int startIndex = 0;

        for (int i = 1; i < partitions ; i++) {
            list.add(index, element.substring(startIndex,startIndex + numberOfPartitions));
            index++;
            startIndex += numberOfPartitions;
        }
        list.add(index, element.substring(startIndex));


    }
}
