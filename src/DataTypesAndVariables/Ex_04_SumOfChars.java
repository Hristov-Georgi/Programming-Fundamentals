package DataTypesAndVariables;

import java.util.Scanner;

public class Ex_04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int symbols = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= symbols ; i++) {
            sum += scanner.nextLine().charAt(0);


        }

        System.out.printf("The sum equals: %d", sum);
    }
}
