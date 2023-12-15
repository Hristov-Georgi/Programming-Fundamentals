package Methods;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        addNums(command, firstNum, secondNum);
        multiplyNums(command, firstNum, secondNum);
        subtractNums(command, firstNum, secondNum);
        divideNums(command, firstNum, secondNum);


    }

    public static void addNums (String command, int num1, int num2){

        if(command.equals("add")){
            System.out.println(num1 + num2);
        }
    }

    public static void multiplyNums (String command, int num1, int num2){
        if(command.equals("multiply")){
            System.out.println(num1 * num2);
        }
    }

    public static void subtractNums (String command, int num1, int num2){

        if (command.equals("subtract")){
            System.out.println(num1 - num2);
        }
    }

    public static void divideNums (String command, int num1, int num2){
        if(command.equals("divide")){
            System.out.println(num1 / num2);
        }
    }
}
