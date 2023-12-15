package TextProcessingTraining;

import java.util.Scanner;

public class Ex03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] filePathArr = scanner.nextLine().split("\\\\");

        String[] nameExtension = filePathArr[filePathArr.length - 1].split("\\.");

        System.out.printf("File name: %s %nFile extension: %s", nameExtension[0], nameExtension[1]);


    }
}
