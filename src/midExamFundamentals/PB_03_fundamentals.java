package midExamFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PB_03_fundamentals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phonesInShopList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String inputCommands = scanner.nextLine();
        while (!inputCommands.equals("End")) {

            String[] commands = inputCommands.split(" - ");

            switch (commands[0]) {

                case "Add":

                    if (!phonesInShopList.contains(commands[1])) {
                        phonesInShopList.add(commands[1]);
                    }
                    break;

                case "Remove":
                    phonesInShopList.remove(commands[1]);

                    break;

                case "Bonus phone":

                    String[] oldNewPhone = commands[1].split(":");
                    String oldPhone = oldNewPhone[0];
                    String newPhone = oldNewPhone[1];

                    if (phonesInShopList.contains(oldPhone)) {
                        int indexOldPhone = phonesInShopList.indexOf(oldPhone);
                        phonesInShopList.add(indexOldPhone + 1, newPhone);
                    }
                    break;
                case "Last":

                    if (phonesInShopList.contains(commands[1])) {
                        phonesInShopList.remove(commands[1]);
                        phonesInShopList.add(commands[1]);
                    }
                    break;
            }

            inputCommands = scanner.nextLine();
        }

        System.out.println(String.join(", ", phonesInShopList));

    }
}
