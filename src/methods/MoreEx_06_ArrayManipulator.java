package methods;

import java.util.Arrays;
import java.util.Scanner;

public class MoreEx_06_ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String commandInput = scanner.nextLine();
        while (!commandInput.equals("end")) {

            String command = commandInput.split(" ")[0];

            switch (command) {
                case "exchange":
                    exchangeIndexes(commandInput, inputArr);
                    break;

                case "max":
                    int result = maxEvenOddElement(commandInput, inputArr);

                    if (result == -1) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(result);
                    }
                    break;

                case "min":
                    int element = minEvenOddElement(commandInput, inputArr);
                    if (element == -1) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(element);
                    }
                    break;

                case "first":
                    int firstCount = Integer.parseInt(commandInput.split(" ")[1]);
                    int[] firstCountElements = firstCountEvenOddElements(commandInput, inputArr);

                    if (firstCount > inputArr.length) {
                        System.out.println("Invalid count");

                    } else if (firstCount >= 0) {

                        System.out.print("[");
                        for (int i = 0; i < firstCountElements.length - 1; i++) {
                            System.out.print(firstCountElements[i] + ", ");
                        }
                        System.out.println(firstCountElements[firstCountElements.length - 1] + "]");

                    } else {
                        System.out.println("[]");
                    }
                    break;

                case "last":
                    int lastCount = Integer.parseInt(commandInput.split(" ")[1]);
                    int[] lastElements = lastCountEvenOddElements(commandInput, inputArr);

                    if (lastCount > inputArr.length) {
                        System.out.println("Invalid count");

                    } else if (lastElements[0] == -1) {
                        System.out.println("[]");

                    } else if (lastCount >= lastElements.length) {
                        System.out.print("[");
                        for (int i = 0; i < lastElements.length - 1; i++) {
                            System.out.print(lastElements[i] + ", ");
                        }
                        System.out.println(lastElements[lastElements.length - 1] + "]");

                    } else if (lastElements.length <= inputArr.length) {

                        int loopStart = lastElements.length - lastCount;

                        System.out.print("[");
                        for (int i = loopStart; i < lastElements.length - 1; i++) {
                            System.out.print(lastElements[i] + ", ");
                        }
                        System.out.println(lastElements[lastElements.length - 1] + "]");
                    }
                    break;
            }
            commandInput = scanner.nextLine();
        }

        System.out.print("[");
        for (int i = 0; i < inputArr.length - 1; i++) {
            System.out.print(inputArr[i] + ", ");
        }
        System.out.println(inputArr[inputArr.length - 1] + "]");
    }

    public static void exchangeIndexes(String command, int[] arr) {
        int index = Integer.parseInt(command.split(" ")[1]);
        int lastIteration = arr.length - 1 - index;

        if (index < 0 || index > arr.length - 1) {
            System.out.println("Invalid index");

        } else {

            for (int i = 0; i < lastIteration; i++) {
                int arrayLastNumber = arr[arr.length - 1];

                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = arrayLastNumber;
            }
        }
    }

    public static int maxEvenOddElement(String command, int[] inputArr) {
        String evenOdd = command.split(" ")[1];
        int maxElement = Integer.MIN_VALUE;
        int lastIndex = -1;

        if (evenOdd.equals("even")) {
            for (int i = 0; i < inputArr.length; i++) {
                if (inputArr[i] % 2 == 0) {
                    if (maxElement <= inputArr[i]) {
                        maxElement = inputArr[i];
                        lastIndex = i;
                    }
                }
            }
        } else if (evenOdd.equals("odd")) {
            for (int i = 0; i < inputArr.length; i++) {
                if (inputArr[i] % 2 != 0) {
                    if (maxElement <= inputArr[i]) {
                        maxElement = inputArr[i];
                        lastIndex = i;
                    }
                }
            }
        }
        return lastIndex;
    }

    public static int minEvenOddElement(String command, int[] inputArr) {
        String evenOdd = command.split(" ")[1];
        int minElement = Integer.MAX_VALUE;
        int lastIndex = -1;

        if (evenOdd.equals("even")) {
            for (int i = 0; i <= inputArr.length - 1; i++) {
                if (inputArr[i] % 2 == 0) {
                    if (minElement >= inputArr[i]) {
                        minElement = inputArr[i];
                        lastIndex = i;
                    }
                }
            }
        } else if (evenOdd.equals("odd")) {
            for (int i = 0; i <= inputArr.length - 1; i++) {
                if (inputArr[i] % 2 != 0) {
                    if (minElement >= inputArr[i]) {
                        minElement = inputArr[i];
                        lastIndex = i;
                    }
                }
            }
        }
        return lastIndex;
    }

    public static int[] firstCountEvenOddElements(String command, int[] inputArr) {
        int count = Integer.parseInt(command.split(" ")[1]);
        String evenOddElements = command.split(" ")[2];

        int counter = 0;
        String repo = "";

        if (evenOddElements.equals("even")) {

            for (int i = 0; i <= inputArr.length - 1; i++) {
                if (inputArr[i] % 2 == 0) {
                    counter++;
                    repo += inputArr[i];

                }
                if (counter == count) {
                    break;
                }
            }
        } else if (evenOddElements.equals("odd")) {

            for (int i = 0; i <= inputArr.length - 1; i++) {
                if (inputArr[i] % 2 != 0) {
                    counter++;
                    repo += inputArr[i];

                }
                if (counter == count) {
                    break;
                }
            }
        }
        if (counter == 0) {
            return new int[]{-1};
        }
        return Arrays.stream(repo.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

    }

    public static int[] lastCountEvenOddElements(String command, int[] inputArr) {

        String evenOddElements = command.split(" ")[2];

        int counter = 0;
        String value = "";

        if (evenOddElements.equals("odd")) {

            for (int i = 0; i <= inputArr.length - 1; i++) {
                if (inputArr[i] % 2 != 0) {
                    counter++;
                    value += inputArr[i];
                }
            }
        } else if (evenOddElements.equals("even")) {

            for (int i = 0; i <= inputArr.length - 1; i++) {
                if (inputArr[i] % 2 == 0) {
                    counter++;
                    value += inputArr[i];
                }
            }
        }

        if (counter == 0) {
            return new int[]{-1};
        }

        return Arrays.stream(value.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
