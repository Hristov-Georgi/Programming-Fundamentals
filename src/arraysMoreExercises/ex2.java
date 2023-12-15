package arraysMoreExercises;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nRows = Integer.parseInt(scanner.nextLine());

        int iterationsCounter = 0;

        int[] previousArr = new int[iterationsCounter];

        for (int row = 1; row <= nRows; row++) {

            iterationsCounter ++;

            int[] numbersArr = new int[row];

                if (numbersArr.length <= 2){
                    numbersArr[0] = 1;
                    numbersArr[numbersArr.length -1] = 1;

                } else {
                    numbersArr[0] = 1;

                    for (int j = 0; j < previousArr.length - 1; j++) {

                        numbersArr[j + 1] = previousArr[j] + previousArr[j + 1];

                    }

                    numbersArr[numbersArr.length -1] = 1;
                }


                for (int printArr: numbersArr) {

                    System.out.print(printArr + " ");

                }





            previousArr = numbersArr;
            //new row
            System.out.println();

        }


    }
}
