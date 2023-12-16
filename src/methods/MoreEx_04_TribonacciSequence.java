package methods;

import java.util.Scanner;

public class MoreEx_04_TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num == 1){
            System.out.println(tribonacciSequence(num)[0]);
        } else {
            for (int chars : tribonacciSequence(num)) {

                System.out.print(chars + " ");
            }
        }
    }

    private static int[] tribonacciSequence(int num) {

        int[] tribonacciArr = new int[num];

        tribonacciArr[0] = 1;

        if (num == 2) {
            tribonacciArr[1] = 1;

        } else if (num == 3){
            tribonacciArr[1] = 1;
            tribonacciArr[2] = 2;

        } else if (num > 3) {

            tribonacciArr[1] = 1;
            tribonacciArr[2] = 2;

            for (int i = 3; i < num; i++) {
                tribonacciArr[i] = tribonacciArr[i - 1]
                        + tribonacciArr[i-2]
                        + tribonacciArr[i-3];
            }
        }

        return tribonacciArr;

    }
}
