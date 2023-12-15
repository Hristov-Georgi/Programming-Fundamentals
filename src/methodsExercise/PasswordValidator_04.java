package methodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (!isPasswordLengthValid(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if(!isPasswordConsistOnlyLettersAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }

        if(!isPasswordHaveAtLeastTwoDigits(password)){
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordHaveAtLeastTwoDigits(password) && isPasswordLengthValid(password)
                && isPasswordConsistOnlyLettersAndDigits(password)){

            System.out.println("Password is valid");
        }


    }

    private static boolean isPasswordLengthValid (String password){

        if(password.length() >= 6 && password.length() <= 10){
        }
        return (password.length() >= 6 && password.length() <= 10);
    }

    private static boolean isPasswordConsistOnlyLettersAndDigits (String password){

        for (char symbols: password.toCharArray()) {
            if(!Character.isLetterOrDigit(symbols)){
                return false;
            }
        }
        return true;
        }

    private static boolean isPasswordHaveAtLeastTwoDigits (String password){

        int digitCounter = 0;

        for(char symbols : password.toCharArray()){
            if (Character.isDigit(symbols)){
                digitCounter ++;
            }
        }
        if (digitCounter < 2){
            return false;
        }

        return true;
        }

}
