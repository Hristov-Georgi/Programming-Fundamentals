package ObjectsAndClassesTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lab01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split("\\s+");

        Random rnd = new Random();

        for (int i = 0; i < wordsArr.length; i++) {

            int rndIndex1 = rnd.nextInt(wordsArr.length);
            //int rndIndex2 = rnd.nextInt(wordsArr.length);

            String oldWord = wordsArr[i];
            wordsArr[i] = wordsArr[rndIndex1];
            wordsArr[rndIndex1] = oldWord;

        }
        System.out.println(String.join(System.lineSeparator(), wordsArr));

    }
}
