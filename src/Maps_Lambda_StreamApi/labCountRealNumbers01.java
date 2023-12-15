package Maps_Lambda_StreamApi;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class labCountRealNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double :: parseDouble)
                .toArray();

        TreeMap<Double, Integer> numbers = new TreeMap<>();


        for (double nums : input){

            if(!numbers.containsKey(nums)){
                numbers.put(nums, 1);
            } else {
                numbers.put(nums, numbers.get(nums) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numbers.entrySet()){
            DecimalFormat df = new DecimalFormat("#.######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue() );
        }

    }
}
