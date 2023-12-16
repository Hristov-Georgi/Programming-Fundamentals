package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_01_CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        char[] chars = inputData.toCharArray();

        for (char character : chars) {

            if (character == ' ') {
                continue;
            }

            if (!charCount.containsKey(character)) {
                charCount.put(character, 1);

            } else {
                charCount.put(character, charCount.get(character) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {

            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());

        }
    }
}
