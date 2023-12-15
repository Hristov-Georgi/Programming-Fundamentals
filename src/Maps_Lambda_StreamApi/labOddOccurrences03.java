package Maps_Lambda_StreamApi;

import java.util.*;

public class labOddOccurrences03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputText = scanner.nextLine().split(" ");

        List<String> resultList = new ArrayList<>();

        Map<String, Integer> occurrences = new LinkedHashMap<>();

        for (int i = 0; i < inputText.length; i++) {

            String toLowercaseText = inputText[i].toLowerCase();

            if(!occurrences.containsKey(toLowercaseText)){
                occurrences.put(toLowercaseText, 1);
            } else {
                occurrences.put(toLowercaseText, occurrences.get(toLowercaseText) + 1);
            }

        }

        for (Map.Entry<String, Integer> entry : occurrences.entrySet()){

            if (entry.getValue() % 2 != 0){
                resultList.add(entry.getKey());

            }
        }
        System.out.print(String.join(", ", resultList));
    }
}
