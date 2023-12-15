package regEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoreExWinningTicket01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> tickets = Arrays.stream(input.split(",\\s+")).collect(Collectors.toList());


    }
}
