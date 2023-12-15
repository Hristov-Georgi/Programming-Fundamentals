package Methods;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        trianglesPrint(num);

    }

    public static void trianglesPrint (int n){

        for (int i = 1; i <= n ; i++) {
            triangleRow(1, i);

        }
        for (int i = n - 1; i >= 1 ; i--) {
            triangleRow(1, i);

        }



    }
    public static void triangleRow (int start, int end){

        for (int row = start; row <= end; row++) {
            System.out.print(row + " ");

        }
        System.out.println();


    }
}
