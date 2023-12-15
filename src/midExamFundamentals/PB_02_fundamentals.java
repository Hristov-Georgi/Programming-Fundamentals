package midExamFundamentals;

import java.util.*;
import java.util.stream.Collectors;

public class PB_02_fundamentals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int commandsNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= commandsNum ; i++) {

            String[] commandsArr = scanner.nextLine().split(" ");

            switch (commandsArr[0]){

                case "Include":

                    String coffeeAdd = commandsArr[1];

                    coffeeList.add(coffeeAdd);

                    break;

                case "Remove":
                    int numberOfCoffees = Integer.parseInt(commandsArr[2]);

                    if(numberOfCoffees < coffeeList.size()){
                        if(commandsArr[1].equals("first")){
                            for (int j = 1; j <= numberOfCoffees; j++) {
                                coffeeList.remove(0);
                            }
                        }else if(commandsArr[1].equals("last")){
                            for (int j = 1; j <=numberOfCoffees ; j++) {
                                coffeeList.remove(coffeeList.size() - 1);
                            }
                        }
                    }
                    break;

                case "Prefer":
                    int coffeeIndex1 = Integer.parseInt(commandsArr[1]);
                    int coffeeIndex2 = Integer.parseInt(commandsArr[2]);

                    if(coffeeIndex1 <= coffeeList.size() -1 && coffeeIndex2 <= coffeeList.size() - 1){

                        String preferCoffee1 = coffeeList.get(coffeeIndex1);
                        String preferCoffee2 = coffeeList.get(coffeeIndex2);

                        coffeeList.set(coffeeIndex1, preferCoffee2 );
                        coffeeList.set(coffeeIndex2, preferCoffee1);
                    }
                    break;

                case "Reverse":

                    Collections.reverse(coffeeList);
                    break;
            }


        }

        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffeeList));


    }
}
