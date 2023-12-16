package finalExamPreparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String instructions = scanner.nextLine();
        while (!instructions.equals("Generate")) {

            String[] commands = instructions.split(">>>");

            switch (commands[0]) {

                case "Contains":

                    if (activationKey.contains(commands[1])) {
                        System.out.printf("%s contains %s%n", activationKey, commands[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }

                    break;

                case "Flip":
                    String upperLower = commands[1];
                    int startIndex = Integer.parseInt(commands[2]);
                    int ednIndex = Integer.parseInt(commands[3]);

                    String substring = activationKey.substring(startIndex, ednIndex);

                    if (upperLower.equals("Upper")) {
                        activationKey = activationKey.replace(substring, substring.toUpperCase());
                        System.out.println(activationKey);

                    } else if (upperLower.equals("Lower")) {
                        activationKey = activationKey.replace(substring, substring.toLowerCase());
                        System.out.println(activationKey);
                    }

                    break;

                case "Slice":
                    startIndex = Integer.parseInt(commands[1]);
                    ednIndex = Integer.parseInt(commands[2]);

                    substring = activationKey.substring(startIndex, ednIndex);
                    activationKey = activationKey.replace(substring, "");

                    System.out.println(activationKey);

                    break;
            }

            instructions = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", activationKey);
    }
}
