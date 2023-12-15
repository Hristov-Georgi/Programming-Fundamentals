package TextProcessingTraining;

import java.util.Arrays;
import java.util.Scanner;

public class lab02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");

        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < strArr.length; i++) {

            stringBuilder.append(String.valueOf(strArr[i]).repeat(strArr[i].length()));
            //stringBuilder.append(strArr[i].repeat(strArr[i].length()));


        }
        System.out.println(stringBuilder);
    }
}
