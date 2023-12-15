package methodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        smallestOfThreeNumbers(firstNum, secondNum, thirdNum);


    }

    public static void smallestOfThreeNumbers (int firstNum, int secondNum, int thirdNum){

        if (firstNum <= secondNum && firstNum <= thirdNum){
            System.out.println(firstNum);
        }else if( secondNum <= firstNum && secondNum <= thirdNum){
            System.out.println(secondNum);
        }else if(thirdNum <= firstNum && thirdNum <= secondNum){
            System.out.println(thirdNum);
        }
    }
}
