package TextProcessingTraining;

import java.util.Scanner;

public class Ex01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(", ");

        for (String name: names ) {

            if(nameIsValid(name)) {
                System.out.println(name);
            }
        }
    }

    public static boolean nameIsValid (String name) {

        if (name.length() < 3 || name.length() > 16) {
            return false;
        }

        for (char symbols: name.toCharArray()) {
            if (!Character.isLetterOrDigit(symbols) && symbols != '-' && symbols != '_'){
                return false;
            }
        }
     return true;
    }
}
