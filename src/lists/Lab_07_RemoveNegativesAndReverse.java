package lists;

import java.util.*;
import java.util.stream.Collectors;

public class Lab_07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numList.removeIf(e -> e < 0);

        if(numList.size() == 0){
            System.out.println("empty");
        } else {
            Collections.reverse(numList);
            System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
