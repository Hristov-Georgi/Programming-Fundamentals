package BasicSyntaxExercise;

import java.util.Scanner;

public class Ex_11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        short lostGames = Short.parseShort(scanner.nextLine());
        float headsetPrice = Float.parseFloat(scanner.nextLine());
        float mousePrice = Float.parseFloat(scanner.nextLine());
        float keyboardPrice = Float.parseFloat(scanner.nextLine());
        float displayPrice = Float.parseFloat(scanner.nextLine());


        short headsetTrashed = (short) (lostGames / 2);
        short mouseTrashed = (short) (lostGames / 3);
        short keyboardTrashed = (short) (lostGames / 6);
        short displayTrashed = (short) (keyboardTrashed / 2);

        double rageExpenses = headsetTrashed * headsetPrice +
                            mouseTrashed * mousePrice +
                            keyboardTrashed * keyboardPrice +
                            displayTrashed * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
