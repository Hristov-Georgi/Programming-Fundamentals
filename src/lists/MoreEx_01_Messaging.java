package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoreEx_01_Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String text = scanner.nextLine();

        List<String> listOfStrings = modifyStringList(text);

        String result = "";

        for (int i = 0; i < numbersList.size(); i++) {

            int sum = 0;
            String[] element = numbersList.get(i).toString().split("");

            for (int j = 0; j < element.length; j++) {
                sum += Integer.parseInt(element[j]);
            }

            while (sum > listOfStrings.size()) {
                sum = sum - listOfStrings.size();
            }

            result += listOfStrings.get(sum);

            listOfStrings.remove(sum);

        }
        System.out.println(result);
    }

    public static List<String> modifyStringList(String text) {

        List<String> manipulationList = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {

            manipulationList.add(String.valueOf(text.charAt(i)));
        }
        return manipulationList;
    }
}
