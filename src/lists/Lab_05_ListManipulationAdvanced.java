package lists;

import java.util.*;
import java.util.stream.Collectors;

public class Lab_05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] commands = scanner.nextLine().split("\\s+");

        while(!commands[0].equals("end")) {

            switch (commands[0]) {

                case "Contains":
                    int numContain = Integer.parseInt(commands[1]);
                    if(numbersList.contains(numContain)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":

                    if(commands[1].equals("even")){
                        System.out.println(returnEvenNumbers(numbersList).toString()
                                .replaceAll("[\\[\\],]", ""));

                    } else if (commands[1].equals("odd")) {
                        System.out.println(returnOddNumbers(numbersList).toString()
                                .replaceAll("[\\[\\],]", ""));
                    }

                    break;
                case "Get":
                    if (commands[1].equals("sum")){
                        int sum = 0;
                        for (int num: numbersList) {
                            sum += num;
                        }
                        System.out.println(sum);
                    }
                    break;

                case "Filter":
                    String condition = commands[1];
                    int referentNumber = Integer.parseInt(commands[2]);

                    System.out.println(returnFilteredNumbers(numbersList, condition, referentNumber)
                            .toString().replaceAll("[\\[\\],]", ""));

                    break;
            }

            commands = scanner.nextLine().split("\\s+");
        }
    }

    public static List<Integer> returnEvenNumbers(List<Integer> numbersList) {

        List<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbersList) {
            if(number % 2 == 0){
                evenNumbers.add(number);
            }

        }
        return evenNumbers;
    }

    public static List<Integer> returnOddNumbers(List<Integer> numbersList) {

        List<Integer> oddNumbers = new ArrayList<>();

        for (int numbers : numbersList) {

            if(numbers % 2 != 0) {
                oddNumbers.add(numbers);
            }
        }
        return oddNumbers;
    }

    public static List<Integer> returnFilteredNumbers(List<Integer> numbersList, String condition, int num) {

        List<Integer> filteredNums = new ArrayList<>();

        if (condition.equals("<")) {
            for (int number : numbersList) {
                if (number < num) {
                    filteredNums.add(number);
                }
            }
        }  else if (condition.equals(">")) {
            for (int number : numbersList) {
                if (number > num) {
                    filteredNums.add(number);
                }
            }
        }  else if (condition.equals("<=")) {
            for (int number : numbersList) {
                if (number <= num) {
                    filteredNums.add(number);
                }
            }
        } else if (condition.equals(">=")) {
            for (int number : numbersList) {
                if (number >= num) {
                    filteredNums.add(number);
                }
            }
        }

        return filteredNums;
    }

}
