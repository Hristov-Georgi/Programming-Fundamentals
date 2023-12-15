package TextProcessingTraining;

import java.util.Scanner;

public class lab03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstStr = scanner.nextLine();
        String secondStr = scanner.nextLine();

        int index = secondStr.indexOf(firstStr);

        while (index != -1) {

            secondStr = secondStr.replaceAll(firstStr, "");

            index = secondStr.indexOf(firstStr);
        }

        System.out.println(secondStr);

    }
}
