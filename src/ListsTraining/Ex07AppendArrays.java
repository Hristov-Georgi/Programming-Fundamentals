package ListsTraining;

import java.util.*;
import java.util.stream.Collectors;

public class Ex07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> separatedArrays = Arrays.stream(input.split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(separatedArrays);

        System.out.println(separatedArrays.toString()
                .replaceAll("[\\[\\],]", "")
                .replaceAll("\\s+", " ")
                .trim());
    }
}
