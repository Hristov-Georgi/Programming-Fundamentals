package methods;

import java.util.Scanner;

public class Ex_04_PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputPassword = scanner.nextLine();

        if (checkCharactersLength(inputPassword)
                && isConsist2Digits(inputPassword)
                && isLetterOrDigit(inputPassword)) {

            System.out.println("Password is valid");

        }
        if(!checkCharactersLength(inputPassword)) {
            System.out.println("Password must be between 6 and 10 characters");

        }
        if(!isLetterOrDigit(inputPassword)) {
            System.out.println("Password must consist only of letters and digits");

        }
        if (!isConsist2Digits(inputPassword)) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    private static boolean checkCharactersLength(String password) {

        if (password.length() >= 6 && password.length() <= 10) {

            return true;

        } else {
            return false;
        }
    }

    private static boolean isLetterOrDigit(String pass) {

        boolean isValid = true;

        for (int i = 0; i < pass.length(); i++) {

            char currentSymbol = pass.charAt(i);

            if (currentSymbol >= 65 && currentSymbol <= 90 || currentSymbol >= 48 && currentSymbol <= 57
                    || currentSymbol >= 97 && currentSymbol <= 122) {
                continue;

            } else {

                isValid = false;
                break;
            }
        }

        return isValid;

    }

    private static boolean isConsist2Digits(String password) {
        int counter = 0;

        for (int i = 0; i < password.length(); i++) {

            char symbol = password.charAt(i);

            if (symbol >= 48 && symbol <= 57) {
                counter += 1;
            }
        }

        if (counter >= 2) {
            return true;

        } else {
            return false;
        }

    }

}

