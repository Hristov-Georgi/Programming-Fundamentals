package midExamFundamentals;

import java.util.Scanner;

public class PB_01_fundamentals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int studentsNumber = Integer.parseInt(scanner.nextLine());
        double flourPackPrice = Double.parseDouble(scanner.nextLine());
        double singleEggPrice = Double.parseDouble(scanner.nextLine());
        double singleApronPrice = Double.parseDouble(scanner.nextLine());




        double flourPriceForCourse = studentsNumber * flourPackPrice - (studentsNumber / 5) * flourPackPrice;
        double eggPriceForCourse = studentsNumber * 10 * singleEggPrice;
        double apronPriceForCourse = studentsNumber * singleApronPrice + Math.ceil(studentsNumber * 0.2) * singleApronPrice;

        double totalPrice = flourPriceForCourse + eggPriceForCourse + apronPriceForCourse;

        if(totalPrice <= budget){

            System.out.printf("Items purchased for %.2f$.", totalPrice);
        }else{
            System.out.printf("%.2f$ more needed.", totalPrice - budget);
        }
    }
}
