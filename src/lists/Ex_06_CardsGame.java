package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex_06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while(firstPlayerDeck.size() != 0 && secondPlayerDeck.size() != 0){

            if(firstPlayerDeck.get(0).equals(secondPlayerDeck.get(0))){
                firstPlayerDeck.remove(0);
                secondPlayerDeck.remove(0);

            } else if(firstPlayerDeck.get(0) > secondPlayerDeck.get(0)) {
                firstPlayerDeck.add(firstPlayerDeck.get(0));
                firstPlayerDeck.add(secondPlayerDeck.get(0));

                firstPlayerDeck.remove(0);
                secondPlayerDeck.remove(0);
            } else {
                secondPlayerDeck.add(secondPlayerDeck.get(0));
                secondPlayerDeck.add(firstPlayerDeck.get(0));

                secondPlayerDeck.remove(0);
                firstPlayerDeck.remove(0);
            }
        }
        if(firstPlayerDeck.size() > secondPlayerDeck.size()) {
            int sum1 = firstPlayerDeck.stream().mapToInt(Integer::valueOf).sum();

            System.out.printf("First player wins! Sum: %d%n", sum1);

        } else {
            int sum2 = secondPlayerDeck.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Second player wins! Sum: %d%n", sum2);
        }

    }
}
