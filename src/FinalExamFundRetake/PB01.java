package finalExamFundRetake;

import java.util.Scanner;

public class PB01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputUsername = scanner.nextLine();

        String inputCommands = scanner.nextLine();
        while (!inputCommands.equals("Registration")){

            String command = inputCommands.split("\\s+")[0];

            switch (command) {

                case "Letters":
                    String lowerOrUpper = inputCommands.split("\\s+")[1];

                    if (lowerOrUpper.equals("Lower")) {
                        inputUsername = inputUsername.toLowerCase();

                    } else if (lowerOrUpper.equals("Upper")) {
                        inputUsername = inputUsername.toUpperCase();

                    }
                    System.out.println(inputUsername);

                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(inputCommands.split("\\s+")[1]);
                    int endIndex = Integer.parseInt(inputCommands.split("\\s+")[2]);

                    StringBuilder reversedSubstring = new StringBuilder();

                    if (startIndex >= 0 && startIndex < inputUsername.length() && endIndex >= 0 && endIndex < inputUsername.length()) {

                        String substring = inputUsername.substring(startIndex, endIndex + 1);

                        reversedSubstring.append(substring);
                        reversedSubstring.reverse();
                        System.out.println(reversedSubstring);

                    }

                    break;
                case "Substring":
                    String subStr = inputCommands.split("\\s+")[1];

                    if (inputUsername.contains(subStr)) {

                        inputUsername = inputUsername.replace(subStr, "");
                        System.out.println(inputUsername);

                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n", inputUsername, subStr);
                    }


                    break;
                case "Replace":

                    String charToReplace = inputCommands.split("\\s+")[1];

                    inputUsername = inputUsername.replaceAll(charToReplace, "\\-");

                    System.out.println(inputUsername);

                    break;
                case "IsValid":
                    String charToContain = inputCommands.split("\\s+")[1];

                    if (inputUsername.contains(charToContain)){
                        System.out.println("Valid username.");
                    } else {
                        System.out.printf("%s must be contained in your username.%n", charToContain);
                    }

                    break;


            }

            inputCommands = scanner.nextLine();
        }
    }
}
