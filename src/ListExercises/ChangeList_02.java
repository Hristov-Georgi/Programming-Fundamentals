package ListExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputText = scanner.nextLine();
        while(!inputText.equals("end")){

            String[] commandArr = inputText.split(" ");

            String commandWord = commandArr[0];

            switch (commandWord){
                case "Delete":
                    int removeElement = Integer.parseInt(commandArr[1]);
                    numberList.removeAll(Collections.singleton(removeElement));

                    break;

                case "Insert":
                    int addElement = Integer.parseInt(commandArr[1]);
                    int addPosition = Integer.parseInt(commandArr[2]);

                    numberList.add(addPosition, addElement);

                    break;
            }

        inputText = scanner.nextLine();
        }

        for(int numbers : numberList){
            System.out.print(numbers + " ");
        }
    }
}
