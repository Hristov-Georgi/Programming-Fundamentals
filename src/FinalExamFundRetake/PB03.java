package FinalExamFundRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PB03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> inStockFood = new LinkedHashMap<>();


        int soldItems = 0;


        String commandLines = scanner.nextLine();
        while (!commandLines.equals("Complete")){
            String command = commandLines.split("\\s+")[0];
            int quantity = Integer.parseInt(commandLines.split("\\s+")[1]);
            String foodName = commandLines.split("\\s+")[2];

            switch (command){

                case "Receive":

                    if (quantity > 0 ){
                        inStockFood.putIfAbsent(foodName, 0);
                        inStockFood.put(foodName, inStockFood.get(foodName) + quantity);
                    }

                    break;
                case "Sell":

                    if (inStockFood.containsKey(foodName)){

                        if (inStockFood.get(foodName) >= quantity){   //имам над исканото количество

                            soldItems += quantity;

                            inStockFood.put(foodName, inStockFood.get(foodName) - quantity);

                            if (inStockFood.get(foodName) <= 0) {

                                inStockFood.remove(foodName);
                            }

                            System.out.printf("You sold %d %s.%n", quantity, foodName);




                        } else {     // нямам достатъчно количество
                            int lastSold = inStockFood.get(foodName);

                            inStockFood.remove(foodName);

                            soldItems += lastSold;

                            System.out.printf("There aren't enough %s. You sold the last %d of them.%n",
                                    foodName, lastSold);

                        }



                    } else {

                        System.out.printf("You do not have any %s.%n", foodName);

                    }

                    break;

            }


            commandLines = scanner.nextLine();
        }


        inStockFood.entrySet().forEach(entry ->
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()
                ));

        System.out.printf("All sold: %d goods", soldItems);




    }
}
