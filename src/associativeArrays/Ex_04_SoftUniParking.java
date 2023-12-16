package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> userPlateNumber = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {

            String[] inputCommands = scanner.nextLine().split("\\s+");

            switch (inputCommands[0]) {

                case "register":

                    if (!userPlateNumber.containsKey(inputCommands[1])) {
                        userPlateNumber.put(inputCommands[1], inputCommands[2]);
                        System.out.printf("%s registered %s successfully%n", inputCommands[1],
                                inputCommands[2]);

                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n",
                                userPlateNumber.get(inputCommands[1]));
                    }

                    break;

                case "unregister":

                    if (!userPlateNumber.containsKey(inputCommands[1])) {
                        System.out.printf("ERROR: user %s not found%n", inputCommands[1]);

                    } else {
                        userPlateNumber.remove(inputCommands[1]);
                        System.out.printf("%s unregistered successfully%n", inputCommands[1]);
                    }

                    break;
            }
        }

        for (Map.Entry<String, String> entry : userPlateNumber.entrySet()) {

            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
