package ListsTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsNumber  = Integer.parseInt(scanner.nextLine());

        List<String> partyList = new ArrayList<>();

        for (int i = 1; i <= commandsNumber ; i++) {
            String[] commands = scanner.nextLine().split("\\s+");

            switch (commands[2]){

                case "going!":
                    goingOnParty(partyList, commands);
                    break;

                case "not":
                    notGoingOnParty(partyList, commands);
                    break;
            }


        }
        for (int i = 0; i < partyList.size(); i++) {
            System.out.println(partyList.get(i));

        }
    }

    public static void goingOnParty(List<String> partyList, String[] commands) {

        String name = commands[0];

        if(!partyList.contains(name)){
            partyList.add(name);
        } else {
            System.out.printf("%s is already in the list!%n", name);
        }
    }

    public static void notGoingOnParty(List<String> partyList, String[] commands) {
        String name = commands[0];

        if(partyList.contains(name)){
            partyList.remove(name);
        } else {
            System.out.printf("%s is not in the list!%n", name);
        }
    }
}
