package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("End")){

            String[] command = input.split(" ");

            switch (command[0]){

                case "Add":

                    numList.add(Integer.parseInt(command[1]));

                    break;
                case "Insert":
                    int number = Integer.parseInt(command[1]);
                    int numIndex = Integer.parseInt(command[2]);
                    if (isIndexValid(numIndex, numList)) {
                        numList.add(numIndex, number);
                    }else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "Remove":
                    int index = Integer.parseInt(command[1]);

                    if(isIndexValid(index, numList)){
                        numList.remove(index);
                    }else{
                        System.out.println("Invalid index");
                    }

                    break;
                case "Shift":
                    if(command[1].equals("left")){
                        int countLeft = Integer.parseInt(command[2]);

                        for (int i = 1; i <= countLeft ; i++) {
                            int firstNum = numList.get(0);
                            numList.remove(0);
                            numList.add(firstNum);

                        }
                    }else if(command[1].equals("right")){
                        int countRight = Integer.parseInt(command[2]);

                        for (int i = 1; i <= countRight ; i++) {
                            int lastNum = numList.get(numList.size() - 1);
                            numList.remove((numList.size() - 1));
                            numList.add(0, lastNum);

                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for(int listNums : numList){
            System.out.print(listNums + " ");
        }
    }

    public static boolean isIndexValid (int index, List<Integer> numList){

        return index >=0 && index < numList.size();
    }
}
