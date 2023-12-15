package ListsTraining;

import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] bombNum = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bomb = bombNum[0];
        int power = bombNum[1];

        for (int i = 0; i < numbersList.size(); i++) {

            if(bomb == numbersList.get(i)) {

                int bombIndex = numbersList.indexOf(bomb);

                int leftSide = Math.max(0, bombIndex - power);
                int rightSide = Math.min(bombIndex + power, numbersList.size() - 1);

                for (int j = rightSide; j >= leftSide ; j--) {
                    numbersList.remove(j);
                }
                i = -1;
            }
        }
        int sum = 0;
        for (int num : numbersList) {
            sum += num;
        }

        System.out.println(sum);
    }
}
