package FinalExamFundRetake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PB02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        String regex = "(\\*|\\@)(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<firstLetter>[A-Za-z]?)\\](\\|)" +
                "\\[(?<secondLetter>[A-Za-z]?)\\]\\4\\[(?<thirdLetter>[A-Za-z]?)\\]\\4$";

        Pattern pattern = Pattern.compile(regex);


        for (int  i = 1;  i <= numberOfInputs ;  i++) {
            String inputInfo = scanner.nextLine();

            Matcher matcher = pattern.matcher(inputInfo);

            if (matcher.find()){

                String tag = matcher.group("tag");
                char firstLetter = matcher.group("firstLetter").charAt(0);
                char secondLetter = matcher.group("secondLetter").charAt(0);
                char thirdLetter = matcher.group("thirdLetter").charAt(0);

                System.out.printf("%s: %d %d %d%n", tag, (int) firstLetter, (int) secondLetter, (int) thirdLetter);


            } else {
                System.out.println("Valid message not found!");
            }

        }

    }
}
