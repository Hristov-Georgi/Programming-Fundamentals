package ListsTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lab03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> mergedList = new ArrayList<>();
        
        if (firstList.size() > secondList.size()){

            for (int i = 0; i < secondList.size(); i++) {

                mergedList.add(firstList.get(i));
                mergedList.add(secondList.get(i));

            }
            mergedList.addAll(firstList.subList(secondList.size(), firstList.size()));

        } else {

            for (int i = 0; i < firstList.size(); i++) {

                mergedList.add(firstList.get(i));
                mergedList.add(secondList.get(i));
            }
            mergedList.addAll(secondList.subList(firstList.size(), secondList.size()));
        }



        System.out.println(mergedList.toString().replaceAll("[\\[\\],]", ""));
    }
}
