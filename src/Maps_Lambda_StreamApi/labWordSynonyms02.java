package Maps_Lambda_StreamApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class labWordSynonyms02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> synonymMap = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonymMap.containsKey(word)){

                synonymMap.put(word, synonym);
            } else {
                synonymMap.put(word, synonymMap.get(word) + ", " + synonym);
            }
        }


        for (Map.Entry<String, String> entry : synonymMap.entrySet()){

            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }
    }
}
