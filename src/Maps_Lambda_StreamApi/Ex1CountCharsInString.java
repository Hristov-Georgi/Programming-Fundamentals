package Maps_Lambda_StreamApi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();

        Map<Character, Integer> countLetters = new LinkedHashMap<>();

        for (int i = 0; i < words.length(); i++) {

            char symbol = words.charAt(i);

            if (symbol == ' '){
                continue;
            }
            if (!countLetters.containsKey(symbol)){
                countLetters.put(symbol, 1);
            } else {
                countLetters.put(symbol, countLetters.get(symbol) + 1);
            }

        }

        for(Map.Entry<Character, Integer> entry : countLetters.entrySet()){

            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
