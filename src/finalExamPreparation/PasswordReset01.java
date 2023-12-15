package finalExamPreparation;

import java.util.Scanner;

public class PasswordReset01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        StringBuilder newRawPassword = new StringBuilder();



        String inputCommands = scanner.nextLine();
        while(!inputCommands.equals("Done")){
            String[] commandsArr = inputCommands.split("\\s+");
            String command = commandsArr[0];

            switch (command){

                case "TakeOdd":

                    for (int i = 1; i <= password.length() -1 ; i+=2) {
                        char oddIndex = password.charAt(i);
                        newRawPassword.append(oddIndex);
                    }
                    password = newRawPassword.toString();

                    System.out.println(password);

                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandsArr[1]);
                    int length = Integer.parseInt(commandsArr[2]);
                    int endIndex = startIndex + length;



                    String substringToCut = password.substring(startIndex, endIndex);
                    password = password.replaceFirst(substringToCut, "");


                    System.out.println(password);


                    break;
                case "Substitute":
                    String substring = commandsArr[1];
                    String substitute = commandsArr[2];

                    if(password.contains(substring)){
                        password = password.replaceAll(substring, substitute);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }

            inputCommands = scanner.nextLine();
        }

        System.out.printf("Your password is: %s%n", password);
    }
}
