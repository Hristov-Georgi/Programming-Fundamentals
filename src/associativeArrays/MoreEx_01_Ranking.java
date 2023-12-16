package associativeArrays;

import java.util.*;

public class MoreEx_01_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contestLogIn = new HashMap<>();
        TreeMap<String, LinkedHashMap<String, Integer>> usersTreeMap = new TreeMap<>();

        String firstInput = scanner.nextLine();

        while (!firstInput.equals("end of contests")) {

            String contest = firstInput.split(":")[0];
            String password = firstInput.split(":")[1];

            contestLogIn.put(contest, password);

            firstInput = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();

        while (!secondInput.equals("end of submissions")) {

            String[] commands = secondInput.split("=>");

            String contest = commands[0];
            String password = commands[1];
            String username = commands[2];
            int points = Integer.parseInt(commands[3]);

            if (contestLogIn.containsKey(contest) && contestLogIn.get(contest).equals(password)) {

                if (!usersTreeMap.containsKey(username)) {

                    usersTreeMap.put(username, new LinkedHashMap<>());
                    usersTreeMap.get(username).put(contest, points);

                } else if (usersTreeMap.containsKey(username) && usersTreeMap.get(username).containsKey(contest)) {

                    if (usersTreeMap.get(username).get(contest) < points) {
                        usersTreeMap.get(username).put(contest, points);
                    }

                } else {
                    usersTreeMap.get(username).put(contest, points);
                }
            }
            secondInput = scanner.nextLine();
        }

        int bestPoints = 0;

        for (Map.Entry<String, LinkedHashMap<String, Integer>> userPoints : usersTreeMap.entrySet()) {
            int sum = userPoints.getValue().values().stream().mapToInt(e -> e).sum();

            if (sum > bestPoints) {
                bestPoints = sum;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> bestUser : usersTreeMap.entrySet()) {

            if (bestUser.getValue().values().stream().mapToInt(e -> e).sum() == bestPoints) {
                System.out.printf("Best candidate is %s with total %d points.%n", bestUser.getKey(), bestPoints);
            }

        }

        System.out.println("Ranking:");

        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : usersTreeMap.entrySet()) {

            System.out.println(user.getKey());

            usersTreeMap.get(user.getKey()).entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .forEach(e -> System.out.printf("#  %s -> %d%n", e.getKey(), e.getValue()));
        }
    }
}
