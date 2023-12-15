package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class demo_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        boolean isIdentical = true;
        int position = 0;

        for (int index = 0; index < firstArr.length; index++) {
            int firstArrIndex = firstArr[index];
            int secondArrIndex = secondArr[index];

            if(firstArrIndex == secondArrIndex){
                sum += firstArr[index];
            }else{
                isIdentical = false;
                position = index;
                break;
            }




        }
        if(!isIdentical){
            System.out.printf("Arrays are not identical. Found difference at %d index.", position);
        }else{
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
