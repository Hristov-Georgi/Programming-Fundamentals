package finalExamFundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PB03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> likesAndCommentsMap = new LinkedHashMap<>();

        while (!input.equals("Log out")){

            String command = input.split("\\:\\s+")[0];
            String username = input.split("\\:\\s+")[1];

            switch (command){

                case "New follower":

                    if(!likesAndCommentsMap.containsKey(username)){
                        likesAndCommentsMap.put(username, 0);

                    }
                    break;

                case "Like":
                    int count = Integer.parseInt(input.split(":\\s+")[2]);

                    if (likesAndCommentsMap.containsKey(username)){
                        int likes = likesAndCommentsMap.get(username);
                        likesAndCommentsMap.put(username, likes + count);
                    } else {
                        likesAndCommentsMap.put(username, count);
                    }
                    break;

                case "Comment":
                    if (likesAndCommentsMap.containsKey(username)){
                        int commentCount = likesAndCommentsMap.get(username);
                        likesAndCommentsMap.put(username, commentCount + 1);

                    } else {
                        likesAndCommentsMap.put(username, 1);
                    }
                    break;

                case "Blocked":
                    if (likesAndCommentsMap.containsKey(username)){
                        likesAndCommentsMap.remove(username);

                    } else {
                        System.out.printf("%s doesn't exist", username);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        int followers = likesAndCommentsMap.size();

        System.out.printf("%d followers%n", followers);

        likesAndCommentsMap.entrySet().forEach(entry ->
            System.out.printf("%n%s: %d%n", entry.getKey(), entry.getValue()));

    }
}
