package textProcessingTraining;

import java.util.Scanner;

public class Ex_07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(explosionResult(input));
    }

    private static StringBuilder explosionResult (String input) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        int explosionStrength = 0;

        for (int i = 0; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i) == '>') {
                explosionStrength = explosionStrength + Integer.parseInt(String.valueOf(stringBuilder.charAt(i + 1)));

                for (int j = i + 1; j <= i + explosionStrength ; j++) {
                    if (stringBuilder.charAt(j) != '>' && explosionStrength > 0 ) {
                        stringBuilder.deleteCharAt(j);
                        explosionStrength -= 1;
                        j--;
                    }
                }
            }
        }
        return stringBuilder;
    }
}
