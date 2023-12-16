package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> studentsScoreMap = new LinkedHashMap<>();
        Map<String, Integer> languageSubmissions = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")) {

            String studentName = input.split("-")[0];
            String language = input.split("-")[1];

            if (language.equals("banned")) {
                studentsScoreMap.remove(studentName);
            } else {
                Integer points = Integer.parseInt(input.split("-")[2]);

                if (!studentsScoreMap.containsKey(studentName)) {
                    studentsScoreMap.put(studentName, points);
                } else if (studentsScoreMap.get(studentName) < points) {
                    studentsScoreMap.put(studentName, points);
                }

                if (!languageSubmissions.containsKey(language)) {
                    languageSubmissions.put(language, 0);
                }
                languageSubmissions.put(language, languageSubmissions.get(language) + 1);
            }

            input = scanner.nextLine();
        }

        System.out.println("Results:");

        studentsScoreMap.entrySet().forEach(entry ->
                System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));

        System.out.println("Submissions:");

        languageSubmissions.entrySet().forEach(entry ->
                System.out.println(entry.getKey()
                + " - " + entry.getValue()));
    }
}

//  System.out.println("Results:");
//        userPoints.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
//                        .thenComparing(Map.Entry.comparingByKey()))
//                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));
//
//        System.out.println("Submissions:");
//        languageCount.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
//                        .thenComparing(Map.Entry.comparingByKey()))
//                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));