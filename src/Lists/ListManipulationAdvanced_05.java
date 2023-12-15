package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("end")){

            String[] commandArr = input.split(" ");
            String command = commandArr[0];

            switch (command){
                case "Contains":
                    int numContain = Integer.parseInt(commandArr[1]);
                    if(numList.contains(numContain)){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if(commandArr[1].equals("even")) {
                        for (int evenNums : numList) {
                            if (evenNums % 2 == 0) {
                                System.out.print(evenNums + " ");
                            }
                        }
                        System.out.println();
                    }else if(commandArr[1].equals("odd")){
                        for(int oddNums : numList){
                            if(oddNums % 2 != 0){
                                System.out.print(oddNums + " ");
                            }

                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    if(commandArr[1].equals("sum")){
                        int sumOfAllElements = 0;
                        for(int numsSum : numList){
                            sumOfAllElements += numsSum;
                        }
                        System.out.println(sumOfAllElements);
                    }
                    break;
                case "Filter":
                    int number = Integer.parseInt(commandArr[2]);
                    if(commandArr[1].equals("<")){
                        for(int lowerNum : numList){
                            if(lowerNum < number){
                                System.out.print(lowerNum + " ");

                            }
                        }
                        System.out.println();
                    }else if(commandArr[1].equals(">")){
                        for(int biggerNum : numList){
                            if(biggerNum > number){
                                System.out.print(biggerNum + " ");

                            }
                        }
                        System.out.println();
                    }else if(commandArr[1].equals("<=")){
                        for(int lowerOrEqual : numList){
                            if(lowerOrEqual <= number){
                                System.out.print(lowerOrEqual + " ");

                            }
                        }
                        System.out.println();
                    }else if(commandArr[1].equals(">=")){
                        for(int biggerOrEqual : numList){
                            if(biggerOrEqual >= number){
                                System.out.print(biggerOrEqual + " ");

                            }
                        }
                        System.out.println();
                    }
                    break;
            }
        input = scanner.nextLine();

        }
    }
}
