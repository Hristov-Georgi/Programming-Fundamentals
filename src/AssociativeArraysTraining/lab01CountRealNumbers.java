package AssociativeArraysTraining;

import java.sql.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class lab01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> numsMap = new TreeMap<>();

        for (double number: numbersArr) {

            if(!numsMap.containsKey(number)) {
                numsMap.put(number, 0);
            }

            numsMap.put(number, numsMap.get(number) + 1);

        }

        for (Map.Entry<Double, Integer> num : numsMap.entrySet()) {

            System.out.printf("%.0f -> %d%n",num.getKey(), num.getValue());

        }
    }
}
