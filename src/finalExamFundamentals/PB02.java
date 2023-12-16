package finalExamFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PB02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        String regex = "^(\\$|\\%)(?<tag>[A-Z][a-z]{2,})\\1\\: \\[(?<num1>[0-9]+)\\](\\|)\\[(?<num2>[0-9]+)\\]\\4\\[(?<num3>[0-9]+)\\]\\4$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= numberOfInputs ; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);
            StringBuilder decryptedMessage = new StringBuilder();

            if (matcher.find()){

                String tag = matcher.group("tag");
                int num1 = Integer.parseInt(matcher.group("num1"));
                int num2 = Integer.parseInt(matcher.group("num2"));
                int num3 = Integer.parseInt(matcher.group("num3"));

                decryptedMessage.append((char)num1);
                decryptedMessage.append((char)num2);
                decryptedMessage.append((char) num3);

                System.out.printf("%s: %s%n", tag, decryptedMessage);

            } else {
                System.out.println("Valid message not found!");
            }

        }

    }
}
