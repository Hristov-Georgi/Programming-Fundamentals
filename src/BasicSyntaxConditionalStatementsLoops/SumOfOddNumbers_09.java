package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int cycles = 0;

        for (int i = 1; i <= 100; i += 2) {
            cycles ++;
            if (cycles > n){
                break;
            }
            System.out.println(i);



            sum += i;

        }

            System.out.printf("Sum: %d", sum);


    }
}
