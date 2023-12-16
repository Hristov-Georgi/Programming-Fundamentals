package basicSyntaxConditionalStatementsLoops.lab;

import java.util.Scanner;

public class Lab_12_EvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        while (input % 2 != 0){

            System.out.println("Please write an even number.");

            input = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d", Math.abs(input));

    }
}
