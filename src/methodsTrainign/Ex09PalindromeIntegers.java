package methodsTrainign;

import java.util.Scanner;

public class Ex09PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            if(isPalindrome(input)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String input) {

        String reversedInput = "";

        for (int i = input.length() - 1; i >= 0 ; i--) {
            reversedInput += input.charAt(i);
        }
        if(input.equals(reversedInput)){
            return true;
        } else {
            return false;
        }
    }

}
