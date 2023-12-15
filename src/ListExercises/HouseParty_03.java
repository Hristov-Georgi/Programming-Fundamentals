package ListExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsNumber = Integer.parseInt(scanner.nextLine());

        List<String> namesList = new ArrayList<>();

        for (int i = 0; i < commandsNumber ; i++) {

            String command = scanner.nextLine();

            String[] isGoingisNotGoingToParty = command.split(" ");

            if(isGoingisNotGoingToParty[2].equals("going!") && namesList.contains(isGoingisNotGoingToParty[0])){

                System.out.printf("%s is already in the list!%n", isGoingisNotGoingToParty[0]);

            }else if (isGoingisNotGoingToParty[2].equals("going!") && !namesList.contains(isGoingisNotGoingToParty[0])){

                namesList.add(isGoingisNotGoingToParty[0]);

            }else if(isGoingisNotGoingToParty[2].equals("not") && namesList.contains(isGoingisNotGoingToParty[0])){

                namesList.remove(isGoingisNotGoingToParty[0]);

            }else if(isGoingisNotGoingToParty[2].equals("not") && !namesList.contains(isGoingisNotGoingToParty[0])){

                System.out.printf("%s is not in the list!%n", isGoingisNotGoingToParty[0]);
            }
        }
        for(String names : namesList){
            System.out.println(names);
        }
    }
}

