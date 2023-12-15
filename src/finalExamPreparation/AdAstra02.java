package finalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String foodInfo = scanner.nextLine();

        String regex = "(\\#|\\|)(?<itemName>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(foodInfo);

        int totalCalories = 0;
        StringBuilder printing = new StringBuilder();

        while (matcher.find()){

            String foodName = matcher.group("itemName");
            String expDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;

            printing.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n",
                    foodName, expDate,calories ));

        }
        int daysToLast = totalCalories / 2000;

        System.out.printf("You have food to last you for: %d days!%n", daysToLast);
        System.out.println(printing);


    }
}
