package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] filePathArr = scanner.nextLine().split("\\\\");

        String file = filePathArr[filePathArr.length - 1];

        String[] nameAndExtension = file.split("\\.");

        String fileName = nameAndExtension[0];
        String fileExtension = nameAndExtension[1];


        System.out.printf("File name: %s%n" +
                "File extension: %s%n", fileName, fileExtension);
    }
}
