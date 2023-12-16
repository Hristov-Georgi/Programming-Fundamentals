package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab_02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int listSize = numList.size();

        for (int i = 0; i < listSize / 2; i++) {

            int result = numList.get(i) + numList.get(numList.size() - 1);

            numList.set(i, result);
            numList.remove(numList.size() - 1);

        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
