package methodsExercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        double firstFactorial = firstNumFactorial(num1);
        double secondFactorial = secondNumFactorial(num2);

        System.out.printf("%.2f", firstFactorial / secondFactorial);



    }

    public static double firstNumFactorial (int num1){

        double sumFact1 = 1.00 ;

        for (int i = 1; i <= num1 ; i++) {

            sumFact1 = sumFact1 * i;


        }
         return sumFact1;
    }

    public static double secondNumFactorial (double num2){

        double sumFact2 = 1.00;

        for (int i = 1; i <= num2 ; i++) {

            sumFact2 = sumFact2 * i;

        }
        return sumFact2;


    }
}
