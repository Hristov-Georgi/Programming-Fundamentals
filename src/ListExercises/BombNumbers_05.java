package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numberList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String[] bomb = scanner.nextLine().split("\\s+");

        String bombNumber = bomb[0];
        int powerNum = Integer.parseInt(bomb[1]);


        while (numberList.contains(bombNumber)){

            int bombNumIndex = numberList.indexOf(bombNumber);

            int left = Math.max(0, bombNumIndex - powerNum);
            int right = Math.min(bombNumIndex + powerNum, numberList.size() - 1);

            for (int i = right; i >= left ; i--) {
                numberList.remove(i);

            }



        }

        System.out.println(numberList.stream().mapToInt(Integer::parseInt).sum());



    }
}
