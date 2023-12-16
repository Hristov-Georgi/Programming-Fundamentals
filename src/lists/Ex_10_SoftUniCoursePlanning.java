package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex_10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {

            String[] commands = input.split(":");

            String lessonTitle = commands[1];
            String exerciseTitle = lessonTitle + "-Exercise";

            switch (commands[0]) {

                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(commands[2]);

                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(index, lessonTitle);
                    }
                    break;

                case "Remove":
                    if (schedule.contains(exerciseTitle) && schedule.contains(lessonTitle)) {
                        schedule.remove(exerciseTitle);
                    }
                    schedule.remove(lessonTitle);

                    break;

                case "Swap":
                    String lessonToSwap = commands[2];
                    String exerciseToSwapTitle = lessonToSwap + "-Exercise";

                    if (schedule.contains(lessonTitle) && schedule.contains(lessonToSwap)) {
                        int firstIndex = schedule.indexOf(lessonTitle);
                        int secondIndex = schedule.indexOf(lessonToSwap);

                        schedule.set(secondIndex, lessonTitle);
                        schedule.set(firstIndex, lessonToSwap);

                        if ((firstIndex >= 0) && (firstIndex <= schedule.size() - 2)) {

                            if (schedule.get(firstIndex + 1).equals(exerciseTitle)) {
                                schedule.add(secondIndex + 1, exerciseTitle);
                                schedule.remove(firstIndex + 1);
                            }
                        }
                        if ((secondIndex >= 0) && (secondIndex <= schedule.size() - 2)) {

                            if (schedule.get(secondIndex + 1).equals(exerciseToSwapTitle)) {
                                schedule.remove(secondIndex + 1);
                                schedule.add(firstIndex + 1, exerciseToSwapTitle);
                            }
                        }
                    }
                    break;

                case "Exercise":
                    if (schedule.contains(lessonTitle) && !schedule.contains(exerciseTitle)) {
                        int indexOfTitle = schedule.indexOf(lessonTitle);
                        schedule.add(indexOfTitle + 1, exerciseTitle);

                    } else if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                        schedule.add(exerciseTitle);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < schedule.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, schedule.get(i));
        }
    }
}
