package ArraysExercise;


import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] number = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <= number.length - 1 ; i++) {

            int currentNum = number[i];

            if(i == number.length - 1){
                System.out.print(currentNum + " ");
                break;
            }

            boolean isTop = false;
            for (int j = i + 1 ; j <= number.length - 1 ; j++) {
                int nextNumber = number[j];

                if( currentNum > nextNumber ){
                    isTop = true;
                }else{
                    isTop = false;
                    break;
                }
            }
            if(isTop) {
                System.out.print(currentNum + " ");
            }

        }


    }
}
