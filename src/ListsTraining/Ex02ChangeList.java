package ListsTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("end")) {
            String[] commands = input.split(" ");

            switch (commands[0]) {

                case "Delete":
                    deleteListElements(numbersList, commands);
                    break;

                case "Insert":
                    insertListElements(numbersList, commands);
                    break;

            }
            input = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static void deleteListElements(List<Integer> intLIst, String[] command ) {

        int elementToDelete = Integer.parseInt(command[1]);

        for (int i = 0; i < intLIst.size(); i++) {

            if(intLIst.get(i) == elementToDelete){
                intLIst.remove(i);
            }

        }
    }

    public static void insertListElements(List<Integer> integerList, String[] command) {

        int element = Integer.parseInt(command[1]);
        int index = Integer.parseInt(command[2]);

        integerList.add(index, element);
    }
}
