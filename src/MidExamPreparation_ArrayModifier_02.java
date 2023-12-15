import java.util.Arrays;
import java.util.Scanner;

public class MidExamPreparation_ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();
        while(!input.equals("end")){

            String[] command = input.split(" ");

            switch (command[0]){
                case "swap":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    int oldIndex1 = numbersArr[index1];
                    int oldIndex2 = numbersArr[index2];
                    numbersArr[index1] = oldIndex2;
                    numbersArr[index2] = oldIndex1;
                    break;

                case "multiply":
                    int firstIndex = Integer.parseInt(command[1]);
                    int secondIndex = Integer.parseInt(command[2]);
                    int multiplyIndexes = numbersArr[firstIndex] * numbersArr[secondIndex];
                    numbersArr[firstIndex] = multiplyIndexes;
                    break;

                case "decrease":

                    for (int i = 0; i < numbersArr.length ; i++) {
                        numbersArr[i] -= 1;
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        String[] resultArr = new String[numbersArr.length];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = String.valueOf(numbersArr[i]);
        }
        System.out.println(String.join(", ",resultArr));


    }
}
