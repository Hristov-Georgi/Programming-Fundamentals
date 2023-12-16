package regEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = 0;

        List<String> furnitureList = new ArrayList<>();

        String regEx = ">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";

        Pattern pattern = Pattern.compile(regEx);

        String info = scanner.nextLine();
        while (!info.equals("Purchase")){

            Matcher matcher = pattern.matcher(info);

            if(matcher.find()){
                String furnitureName = matcher.group("name");
                double furniturePrice = Double.parseDouble(matcher.group("price"));
                int furnitureQuantity = Integer.parseInt(matcher.group("quantity"));

                furnitureList.add(furnitureName);
                double currentPrice = furniturePrice * furnitureQuantity;
                money += currentPrice;

            }

            info = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furnitureList.forEach(System.out :: println);
        System.out.printf("Total money spend: %.2f", money);
    }
}
