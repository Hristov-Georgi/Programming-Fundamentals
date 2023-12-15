package ListsTraining;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;

public class MoreEx04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstInputList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondInputList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(secondInputList);

        List<Integer> concatenatedList = new ArrayList<>();

        int firstRemainingElement = 0;
        int secondRemainingElement = 0;

        if(firstInputList.size() > secondInputList.size()){

            for (int firstListElement = 0; firstListElement <= secondInputList.size() - 1 ; firstListElement ++) {
                concatenatedList.add(firstInputList.get(firstListElement));
                concatenatedList.add(firstListElement + 1, secondInputList.get(firstListElement));
            }

            firstRemainingElement = firstInputList.get(firstInputList.size() - 1);
            secondRemainingElement = firstInputList.get(firstInputList.size() - 2);

        } else {

            for (int secondListElement = 0; secondListElement <= firstInputList.size() - 1; secondListElement ++) {
                concatenatedList.add(firstInputList.get(secondListElement));
                concatenatedList.add(secondListElement + 1, secondInputList.get(secondListElement));
            }

            firstRemainingElement = secondInputList.get(secondInputList.size() - 1);
            secondRemainingElement = secondInputList.get(secondInputList.size() - 2);
        }

        System.out.println(finalResult(concatenatedList, firstRemainingElement, secondRemainingElement)
                .toString().replaceAll("[\\[\\],]", ""));

    }

    public static List<Integer> finalResult(List<Integer> sumList,
                                            int firstRemainingElement, int secondRemainingElement) {

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < sumList.size(); i++) {

            if(firstRemainingElement > secondRemainingElement
               && (sumList.get(i) > secondRemainingElement && sumList.get(i) < firstRemainingElement)) {

                resultList.add(sumList.get(i));

            } else if(secondRemainingElement > firstRemainingElement
            && (sumList.get(i) > firstRemainingElement && sumList.get(i) < secondRemainingElement)) {

                resultList.add(sumList.get(i));
            }
        }
        Collections.sort(resultList);

        return resultList;
    }
}
