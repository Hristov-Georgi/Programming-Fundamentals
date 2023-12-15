package AssociativeArraysTraining;

import java.util.*;

public class lab03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, Integer> wordsOccurrence = new LinkedHashMap<>();

        for (int i = 0; i < wordsArray.length ; i++) {

            String currentWord = wordsArray[i].toLowerCase();

            if(!wordsOccurrence.containsKey(currentWord)){
                wordsOccurrence.put(currentWord, 0);
            }
            wordsOccurrence.put(currentWord, wordsOccurrence.get(currentWord) + 1);
        }

        List<String> dataList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsOccurrence.entrySet()){

            if(entry.getValue() % 2 != 0) {
                dataList.add(entry.getKey());
            }
        }
        System.out.println(dataList.toString().replaceAll("[\\[\\]]", ""));
        //System.out.println(String.join(", ", dataList));

    }
}
