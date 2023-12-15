package ArraysExercise;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Scanner;

public class demoEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        StringBuilder topInteger = new StringBuilder();

        for (int i = 0; i <= numArr.length -1 ; i++) {

            int currentNum = numArr[i];

            if (i == (numArr.length -1)){
                topInteger.append(numArr[i]);
                break;
            }

            boolean isTop = false;

            for (int j = i + 1; j <= numArr.length -1 ; j++) {

                if (currentNum > numArr[j]){
                    isTop = true;
                }else{
                    isTop = false;
                    break;
                }

            }
            if (isTop) {
                topInteger.append(currentNum).append(" ");
            }

        }

        System.out.println(topInteger);
    }
}
