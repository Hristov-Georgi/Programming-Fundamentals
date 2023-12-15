package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHandOfCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondHandOfCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());



        while (firstHandOfCards.size() != 0 && secondHandOfCards.size() != 0){

            int firstHand = firstHandOfCards.get(0);
            int secondHand = secondHandOfCards.get(0);

            firstHandOfCards.remove(0);
            secondHandOfCards.remove(0);

            if(firstHand > secondHand){
                firstHandOfCards.add(firstHand);
                firstHandOfCards.add(secondHand);
            }else if(secondHand > firstHand){
                secondHandOfCards.add(secondHand);
                secondHandOfCards.add(firstHand);
            }
        }
        if (firstHandOfCards.size() == 0){
            System.out.printf("Second player wins! Sum: %d", sumOfCards(secondHandOfCards));
        }else if (secondHandOfCards.size() == 0){
            System.out.printf("First player wins! Sum: %d", sumOfCards(firstHandOfCards));
        }

    }

    public static int sumOfCards (List<Integer> sumList){

        int sum = 0;
        for(int sumCards : sumList){
            sum += sumCards;
        }
        return sum;
    }
}
