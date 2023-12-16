package objectsAndClasses.ex_06_OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<OrderByAge> personData = new ArrayList<>();

        while (!input.equals("End")) {

            String[] elements = input.split("\\s+");

            OrderByAge orderByAge = new OrderByAge(elements[0], elements[1], Integer.parseInt(elements[2]));

            personData.add(orderByAge);

            input = scanner.nextLine();
        }

        personData.sort(Comparator.comparing(OrderByAge::getAge));

        for (OrderByAge data : personData) {
            System.out.println(data);
        }
    }
}
