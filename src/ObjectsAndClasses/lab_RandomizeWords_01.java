package ObjectsAndClasses;


import java.util.Random;
import java.util.Scanner;


public class lab_RandomizeWords_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        Random rnd = new Random();

        for (int i = 0; i < inputArr.length; i++) {
            int index1 = rnd.nextInt(inputArr.length);
            int index2 = rnd.nextInt(inputArr.length);

            String word1 = inputArr[index1];
            inputArr[index1] = inputArr[index2];
            inputArr[index2] = word1;



        }

        System.out.println(String.join(System.lineSeparator(), inputArr));



     }
}
