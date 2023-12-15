package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernamesArr = scanner.nextLine().split(", ");

        for (String username : usernamesArr) {

            if(isUsernamesValid(username)){
                System.out.println(username);
            }
        }
    }

    private static boolean isUsernamesValid (String username){

        if (username.length() < 3 || username.length() > 16){
            return false;
        }

        for (char usernameSymbols : username.toCharArray()){
            if (!Character.isLetterOrDigit(usernameSymbols) && usernameSymbols != '_' && usernameSymbols != '-'){
                return false;
            }
        }

        return true;
    }
}
