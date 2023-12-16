package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex_04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split("\\s+")[0];

            switch (command) {

                case "Add":
                    int addNum = Integer.parseInt(input.split("\\s+")[1]);
                    numbersList.add(addNum);

                    break;

                case "Insert":
                    int insertIndex = Integer.parseInt(input.split("\\s+")[2]);
                    int insertNum = Integer.parseInt(input.split("\\s+")[1]);

                    if (insertIndex < 0 || insertIndex > numbersList.size() - 1) {
                        System.out.println("Invalid index");

                    } else {
                        numbersList.add(insertIndex, insertNum);
                    }
                    break;

                case "Remove":
                    int removeIndex = Integer.parseInt(input.split("\\s+")[1]);

                    if (removeIndex < 0 || removeIndex >= numbersList.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbersList.remove(removeIndex);
                    }
                    break;

                case "Shift":
                    String leftRight = input.split("\\s+")[1];
                    int count = Integer.parseInt(input.split("\\s+")[2]);

                    int counter = 0;

                    if (leftRight.equals("left")) {

                        for (int i = 0; i < count; i++) {
                            int firstNum = numbersList.get(0);

                            numbersList.add(firstNum);
                            numbersList.remove(0);
                        }
                    } else if (leftRight.equals("right")) {

                        for (int i = 0; i < count; i++) {
                            int lastNum = numbersList.get(numbersList.size() - 1);

                            numbersList.add(0, lastNum);
                            numbersList.remove(numbersList.size() - 1);
                        }
                    }

                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
