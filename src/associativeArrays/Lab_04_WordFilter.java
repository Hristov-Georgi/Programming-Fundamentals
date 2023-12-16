package associativeArrays;

import java.util.Scanner;

public class Lab_04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputWords = scanner.nextLine().split(" ");

        for (int i = 0; i < inputWords.length; i++) {

            if (inputWords[i].length() % 2 == 0) {
                System.out.println(inputWords[i]);
            }

        }

//        String[] inputWords = Arrays.stream(scanner.nextLine().split(" "))
//                .filter(w -> w.length() % 2 == 0)
//                .toArray(String[]::new);
//
//        for (int i = 0; i < inputWords.length; i++) {
//            System.out.println(inputWords[i]);
//
//        }
    }
}
