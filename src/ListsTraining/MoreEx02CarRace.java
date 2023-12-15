package ListsTraining;

import java.util.Arrays;
import java.util.Scanner;


public class MoreEx02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] raceTime = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        double leftRacerTime = 0;
        double rightRacerTime = 0;

        for (int left = 0; left < raceTime.length / 2; left++) {

            if(raceTime[left] == 0) {
                leftRacerTime = 0.8 * leftRacerTime;
            } else {
                leftRacerTime += raceTime[left];
            }
        }

        for (int right = raceTime.length - 1; right > raceTime.length / 2 ; right--) {

            if(raceTime[right] == 0) {
                rightRacerTime = 0.8 * rightRacerTime;
            } else {
                rightRacerTime += raceTime[right];
            }
        }

        if(leftRacerTime < rightRacerTime) {
            System.out.printf("The winner is left with total time: %.1f", leftRacerTime);
        } else if(rightRacerTime < leftRacerTime) {
            System.out.printf("The winner is right with total time: %.1f", rightRacerTime);
        }
    }
}
