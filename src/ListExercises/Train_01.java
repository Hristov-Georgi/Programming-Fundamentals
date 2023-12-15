package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxWagonCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while(!command.equals("end")){

            String[] commandArr = command.split(" ");

            if (commandArr[0].equals("Add")){
                int addWagon = Integer.parseInt(commandArr[1]);
                wagons.add(addWagon);
            }else{
                int addPassengers = Integer.parseInt(commandArr[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if((wagons.get(i) + addPassengers) <= maxWagonCapacity){
                        wagons.set(i, wagons.get(i) + addPassengers);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }



        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
