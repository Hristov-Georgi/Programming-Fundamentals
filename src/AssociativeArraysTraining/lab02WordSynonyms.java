package AssociativeArraysTraining;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class lab02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<String>> synonymMap = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if(!synonymMap.containsKey(word)) {

                synonymMap.put(word, new ArrayList<>());
            }

            synonymMap.get(word).add(synonym);

        }

        for (Map.Entry<String, ArrayList<String>> entry : synonymMap.entrySet()){

            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));

        }
    }
}
