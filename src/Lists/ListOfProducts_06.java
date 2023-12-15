package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> productsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String item = scanner.nextLine();

            productsList.add(item);
        }

        Collections.sort(productsList);

        for (int j = 0; j < productsList.size(); j++) {

            System.out.printf("%d.%s%n", j + 1, productsList.get(j));

        }

    }
}
