package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder explosionInput = new StringBuilder(scanner.nextLine());

        int strengthSum = 0;

        for (int i = 0; i < explosionInput.length(); i++) {

            char currentSymbol = explosionInput.charAt(i);

            if(currentSymbol == '>'){

                int explosionStrength = Integer.parseInt(explosionInput.charAt(i + 1) + "");
                strengthSum += explosionStrength;
            } else if (currentSymbol != '>' && strengthSum > 0){

                explosionInput.deleteCharAt(i);
                strengthSum--;
                i--;
            }

        }

        System.out.println(explosionInput);
    }
}
