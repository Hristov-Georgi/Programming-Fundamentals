package ListsTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoreEx05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());

        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> initialQuality = new ArrayList<>();

        initialQuality.addAll(drumSet);

        String commands = scanner.nextLine();

        while(!commands.equals("Hit it again, Gabsy!")) {

            int hitPower = Integer.parseInt(commands);

            for (short drumQuality = 0; drumQuality <= drumSet.size() - 1 ; drumQuality++) {

                int currentQuality = drumSet.get(drumQuality);

                int decreasedQuality = currentQuality - hitPower;

                if(decreasedQuality <= 0) {
                   int drumPrice = initialQuality.get(drumQuality) * 3;

                   if(drumPrice > savings) {
                       drumSet.remove(drumQuality);
                       initialQuality.remove(drumQuality);

                       drumQuality--;

                   } else {
                       drumSet.set(drumQuality, initialQuality.get(drumQuality));
                       savings = savings - drumPrice;
                   }
                } else {
                    drumSet.set(drumQuality, decreasedQuality);
                }
            }

            commands = scanner.nextLine();

        }

        System.out.println(drumSet.toString().replaceAll("[\\[\\],]", ""));

        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
