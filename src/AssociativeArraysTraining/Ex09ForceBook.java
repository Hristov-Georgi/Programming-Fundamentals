package AssociativeArraysTraining;

import javax.sql.XAConnection;
import java.util.*;

public class Ex09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains(" | ")) {

                String forceSide = input.split("\\s+\\|\\s+")[0];
                String forceUser = input.split("\\s+\\|\\s+")[1];

                if (!forceMap.containsKey(forceSide) && !isContainForceUser(forceMap, forceUser)) {
                    forceMap.put(forceSide, new ArrayList<>());
                    forceMap.get(forceSide).add(forceUser);
                } else if (!isContainForceUser(forceMap, forceUser) && forceMap.containsKey(forceSide)) {
                    forceMap.get(forceSide).add(forceUser);

                }

            } else if (input.contains(" -> ")) {

                String forceUser = input.split("\\s+->\\s+")[0];
                String forceSide = input.split("\\s+->\\s+")[1];

                forceMap.entrySet().forEach(entry -> entry.getValue().remove(forceUser));

                if (!forceMap.containsKey(forceSide)) {
                    forceMap.put(forceSide, new ArrayList<>());
                    forceMap.get(forceSide).add(forceUser);
                } else {
                    forceMap.get(forceSide).add(forceUser);
                }

                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }

            input = scanner.nextLine();
        }

            for (Map.Entry<String, List<String>> entry : forceMap.entrySet()) {
                if (entry.getValue().size() > 0) {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    for (String listData : entry.getValue()) {
                        System.out.println("! " + listData);
                    }
                }
            }
    }

    private static boolean isContainForceUser (Map<String, List<String>> usersMap, String forceUser) {

        for (List<String> values : usersMap.values()){
            if (values.contains(forceUser)){
                return true;
            }
        }
        return false;
    }
}
