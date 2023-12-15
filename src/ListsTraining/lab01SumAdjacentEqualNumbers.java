package ListsTraining;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lab01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numberList.size() - 1; i++) {

            double num1 = numberList.get(i);
            double num2 = numberList.get(i + 1);

            if(num1 == num2){
                double result = num1 + num2;
                numberList.set(i, result);
                numberList.remove(i + 1);
                i = -1;
            }
        }
        DecimalFormat df = new DecimalFormat("0.###");

        for (double number : numberList){

            System.out.print(df.format(number) + " ");
        }
    }
}
