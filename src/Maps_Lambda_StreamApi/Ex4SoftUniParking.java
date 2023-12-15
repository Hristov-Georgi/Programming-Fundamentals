package Maps_Lambda_StreamApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex4SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> registeredUsers = new LinkedHashMap<>();


        for (int i = 1; i <= n ; i++) {

            String[] commandArr = scanner.nextLine().split("\\s+");

            if (commandArr[0].equals("register")) {
                String licencePlate = commandArr[2];

                if (!registeredUsers.containsKey(commandArr[1])) {
                    registeredUsers.put(commandArr[1], licencePlate);
                    System.out.printf("%s registered %s successfully%n", commandArr[1], licencePlate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licencePlate);
                }
            } else if (commandArr[0].equals("unregister")) {

                if (!registeredUsers.containsKey(commandArr[1])) {
                    System.out.printf("ERROR: user %s not found%n", commandArr[1]);
                } else {
                    registeredUsers.remove(commandArr[1]);
                    System.out.printf("%s unregistered successfully%n", commandArr[1]);
                }

            }
        }

        for(Map.Entry<String, String> entry : registeredUsers.entrySet()){

            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
