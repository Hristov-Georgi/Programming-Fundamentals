package finalExamPreparation;

import java.util.Scanner;

public class TheImitationGame01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();

        StringBuilder decryptedMessage = new StringBuilder();
        decryptedMessage.append(encryptedMessage);

        String inputCommands = scanner.nextLine();
        while (!inputCommands.equals("Decode")){

            String firstCommand = inputCommands.split("\\|")[0];

            switch (firstCommand){
                case "Move":
                    int index = Integer.parseInt(inputCommands.split("\\|")[1]);

                    for (int i = 0; i < index; i++) {

                        char changeIndex = decryptedMessage.charAt(0);
                        decryptedMessage.deleteCharAt(0);
                        decryptedMessage.append(changeIndex);


                    }
                    break;
                case "Insert":
                    int insertIndex = Integer.parseInt(inputCommands.split("\\|")[1]);
                    String value = inputCommands.split("\\|")[2];



                    if (insertIndex > decryptedMessage.length()){
                        decryptedMessage.append(value);
                    } else {
                        decryptedMessage.insert(insertIndex, value);

                    }


                    break;
                case "ChangeAll":
                    String substring = inputCommands.split("\\|")[1];
                    String replacement = inputCommands.split("\\|")[2];

                    encryptedMessage = decryptedMessage.toString();

                    encryptedMessage = encryptedMessage.replace(substring, replacement);

                    decryptedMessage.replace(0, decryptedMessage.length(), encryptedMessage);

                    break;
            }

            inputCommands = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s%n", decryptedMessage);
    }
}
