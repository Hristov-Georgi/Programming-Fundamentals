package associativeArrays;

import java.util.*;

public class MoreEx_02_Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Integer>> contestMap = new LinkedHashMap<>();
        Map<String, Integer> totalUserPoints = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("no more time")) {

            String username = input.split(" -> ")[0];
            String contest = input.split(" -> ")[1];
            int points = Integer.parseInt(input.split(" -> ")[2]);

            if (!contestMap.containsKey(contest)) {
                contestMap.put(contest, new LinkedHashMap<>());
                contestMap.get(contest).put(username, points);

            } else if (contestMap.get(contest).containsKey(username) &&
                    contestMap.get(contest).get(username) < points) {
                contestMap.get(contest).put(username, points);

            } else {
                contestMap.get(contest).put(username, points);

            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> users : contestMap.entrySet()) {

            users.getValue().entrySet().forEach(e -> {
                if (totalUserPoints.containsKey(e.getKey())) {
                    totalUserPoints.put(e.getKey(), totalUserPoints.get(e.getKey()) + e.getValue());
                } else {
                    totalUserPoints.put(e.getKey(), e.getValue());
                }
            });
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> contest : contestMap.entrySet()) {
            System.out.printf("%s: %d participants%n", contest.getKey(), contest.getValue().size());

            int[] count = {0};
            contest.getValue().entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .forEach(e -> {
                        count[0] += 1;
                        System.out.printf("%d. %s <::> %d%n", count[0], e.getKey(), e.getValue());
                    });
        }

        System.out.println("Individual standings:");

        int[] counter = {0};
        totalUserPoints.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(e -> {
                    counter[0] += 1;
                    System.out.printf("%d. %s -> %d%n", counter[0], e.getKey(), e.getValue());
                });
    }
}
