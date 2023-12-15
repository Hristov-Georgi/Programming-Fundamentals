package regEx;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Ex02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String racerNames = scanner.nextLine();
        List<String> names = Arrays.stream(racerNames.split(", ")).collect(Collectors.toList());

        Map<String, Integer> racerDistances = new LinkedHashMap<>();
        names.forEach(name -> racerDistances.put(name, 0));

        String letterRegex = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(letterRegex);

        String numbersRegex = "[0-9]";
        Pattern patternNumbers = Pattern.compile(numbersRegex);


        String input = scanner.nextLine();
        while(!input.equals("end of race")){

            StringBuilder racer = new StringBuilder();

            Matcher matcherLetters = patternLetters.matcher(input);

            while (matcherLetters.find()){
                racer.append(matcherLetters.group());

            }

            int distance = 0;

            Matcher matcherNumbers = patternNumbers.matcher(input);

            while (matcherNumbers.find()){
                distance += Integer.parseInt(matcherNumbers.group());

            }

            if (names.contains(racer.toString())){
                int currentDistance = racerDistances.get(racer.toString());
                racerDistances.put(racer.toString(), currentDistance + distance);
            }


            input = scanner.nextLine();

        }

        List<String> topThreeRacers = racerDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.printf("1st place: %s%n", topThreeRacers.get(0));
        System.out.printf("2nd place: %s%n", topThreeRacers.get(1));
        System.out.printf("3rd place: %s%n", topThreeRacers.get(2));



    }
}
