package methods;

import java.util.Scanner;

public class Ex_07_NxNMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        NxNMatrix(n);
    }

    public static void NxNMatrix(int n) {

        for (int row = 1; row <= n ; row++) {

            for (int column = 1; column <= n ; column++) {

                System.out.print(n + " ");
            }

            System.out.println();

        }

    }
}
