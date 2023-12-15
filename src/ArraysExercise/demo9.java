package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")){

            String[] commandArr = command.split(" ");

            switch (commandArr[0]){
                case "swap":

                    int index1 = Integer.parseInt(commandArr[1]);
                    int index2 = Integer.parseInt(commandArr[2]);

                    int firstElement = inputArr[index1];

                    inputArr[index1] = inputArr[index2];

                    inputArr[index2] = firstElement;

                    break;

                case "multiply":

                    int firstIndex = Integer.parseInt(commandArr[1]);
                    int secondIndex = Integer.parseInt(commandArr[2]);

                    int element1 = inputArr[firstIndex];
                    int element2 = inputArr[secondIndex];

                    inputArr[firstIndex] = element1 * element2;

                    break;

                case "decrease":

                    for (int i = 0; i < inputArr.length; i++){

                        inputArr[i] --;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < inputArr.length ; i++) {


            if(i != inputArr.length -1) {

                System.out.print(inputArr[i] + ", ");
            } else {
               System.out.print(inputArr[inputArr.length -1]);
            }
        }
    }
}
