package ArraysExercise;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String commands = scanner.nextLine();


        while (!commands.equals("Yohoho!")){

            String[] separatedCommands = commands.split("\\s+");

            switch (separatedCommands[0]){

                case "Loot":

                    for (int i = 1; i < separatedCommands.length; i++) {

                        for (int j = 0; j < treasureChest.length; j++) {

                            if (!separatedCommands[i].equals(treasureChest[j])){

                                String newChest = separatedCommands[i] + " "
                                                + String.join(" ", treasureChest);
                                treasureChest = newChest.split(" ");

                            }

                        }

                    }
                    break;

                case "Drop":
                    int dropIndex = Integer.parseInt(separatedCommands[1]);

                    if (0 <= dropIndex && dropIndex < treasureChest.length){

                        String loot = treasureChest[dropIndex];

                        for (int i = dropIndex; i < treasureChest.length - 1 ; i++) {

                            treasureChest[i] = treasureChest[i + 1];

                        }
                        treasureChest[treasureChest.length - 1] = loot;

                    }

                    break;

                case "Steal":

                    int stealCount = Integer.parseInt(treasureChest[1]);


                    break;

            }


            commands = scanner.nextLine();
        }
    }
}
