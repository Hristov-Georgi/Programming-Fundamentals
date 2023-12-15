package ArraysExercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");


        for (String elementSecondtArr : secondArr){

            for (String elementFirstArr : firstArr){
                if (elementFirstArr.equals(elementSecondtArr)) {

                    System.out.print(elementSecondtArr + " ");
                }

            }
        }
    }
}
