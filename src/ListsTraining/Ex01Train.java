package ListsTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int wagonMaxCapacity = Integer.parseInt(scanner.nextLine());

        String commands = scanner.nextLine();

        while(!commands.equals("end")){

            String[] commandArr = commands.split(" ");

            if(commandArr[0].equals("Add")){
                wagonList.add(Integer.valueOf(commandArr[1]));

            } else {
                int passengersToAdd = Integer.parseInt(commandArr[0]);

                for (int i = 0; i < wagonList.size(); i++) {
                    int passengers = wagonList.get(i);

                    if(passengers + passengersToAdd <= wagonMaxCapacity) {
                        wagonList.set(i, passengers + passengersToAdd);
                        break;
                    }
                }
            }
            commands = scanner.nextLine();
        }

        System.out.println(wagonList.toString().replaceAll("[\\[\\],]", ""));


    }
}
