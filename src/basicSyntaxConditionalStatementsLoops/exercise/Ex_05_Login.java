package basicSyntaxConditionalStatementsLoops.exercise;

import java.util.Scanner;

public class Ex_05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        String passWord = "";

        for (int position = userName.length() - 1; position >= 0; position--) {
            char currentSymbol = userName.charAt(position);

            passWord += currentSymbol;
        }

        String inputPass = scanner.nextLine();

        int counter = 0;

        while (!inputPass.equals(passWord)) {

            counter++;

            if (counter == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }

            System.out.println("Incorrect password. Try again.");

            inputPass = scanner.nextLine();
        }

        if (inputPass.equals(passWord)) {

            System.out.printf("User %s logged in.", userName);
        }

    }
}

