import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MidExamPreparation_Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journalList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String inputText = scanner.nextLine();
        while (!inputText.equals("Craft!")){

            String[] command = inputText.split(" - ");

            switch (command[0]){
                case "Collect":
                        if(!journalList.contains(command[1])){
                            journalList.add(command[1]);
                        }
                    break;
                case "Drop":

                    journalList.remove(command[1]);
                    break;

                case "Combine Items":
                    String[] splitItems = command[1].split(":");
                    String oldItem = splitItems[0];
                    String newItem = splitItems[1];

                    if(journalList.contains(oldItem)){
                        int oldItemIndex = journalList.indexOf(oldItem);

                        journalList.add(oldItemIndex + 1, newItem);
                    }

                    break;
                case "Renew":

                    if(journalList.contains(command[1])){
                        String savedRenewElement = command[1];

                        journalList.remove(command[1]);
                        journalList.add(savedRenewElement);
                    }
                    break;
            }
            inputText = scanner.nextLine();
        }

        System.out.println(String.join(", ", journalList));
    }

}
