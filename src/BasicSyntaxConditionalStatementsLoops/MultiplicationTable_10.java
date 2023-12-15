package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {

            int multiple = input * i;

            System.out.printf("%d X %d = %d%n", input, i, multiple);

        }


    }

}

