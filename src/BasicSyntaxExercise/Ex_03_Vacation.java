package BasicSyntaxExercise;

import java.util.Scanner;

public class Ex_03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalPrice = 0;

        if (groupType.equals("Students")){
            if(dayOfWeek.equals("Friday") && peopleNumber >= 30){
                totalPrice = 8.45 * peopleNumber - (8.45 * peopleNumber) * 0.15;
            }else if (dayOfWeek.equals("Friday")){
                totalPrice = 8.45 * peopleNumber;
            }else if(dayOfWeek.equals("Saturday") && peopleNumber >= 30){
                totalPrice = 9.80 * peopleNumber - (9.80 * peopleNumber) * 0.15;
            }else if (dayOfWeek.equals("Saturday")){
                totalPrice = 9.80 * peopleNumber;
            }else if (dayOfWeek.equals("Sunday") && peopleNumber >= 30){
                totalPrice = 10.46 * peopleNumber - (10.46 * peopleNumber) * 0.15;
            }else if (dayOfWeek.equals("Sunday")){
                totalPrice = 10.46 * peopleNumber;
            }

        }else if (groupType.equals("Business")){
            if(dayOfWeek.equals("Friday") && peopleNumber >= 100){
                totalPrice = 10.90 * peopleNumber - 10.90 * 10;
            }else if(dayOfWeek.equals("Friday")){
                totalPrice = 10.90 * peopleNumber;
            }else if (dayOfWeek.equals("Saturday") && peopleNumber >= 100){
                totalPrice = 15.60 * peopleNumber - 15.60 * 10;
            }else if (dayOfWeek.equals("Saturday")){
                totalPrice = 15.60 * peopleNumber;
            }else if (dayOfWeek.equals("Sunday") && peopleNumber >= 100){
                totalPrice = 16 * peopleNumber - 16 * 10;
            }else if (dayOfWeek.equals("Sunday")){
                totalPrice = 16 * peopleNumber;
            }
        }else if (groupType.equals("Regular")){
            if(dayOfWeek.equals("Friday") && peopleNumber >= 10 && peopleNumber <= 20){
                totalPrice = 15 * peopleNumber - (15 * peopleNumber) * 0.05;
            }else if (dayOfWeek.equals("Friday")){
                totalPrice = 15 * peopleNumber;
            }else if(dayOfWeek.equals("Saturday") && peopleNumber >= 10 && peopleNumber <= 20){
                totalPrice = 20 * peopleNumber - (20 * peopleNumber) * 0.05;
            }else if (dayOfWeek.equals("Saturday")){
                totalPrice = 20 * peopleNumber;
            }else if (dayOfWeek.equals("Sunday") && peopleNumber >= 10 && peopleNumber <= 20){
                totalPrice = 22.50 * peopleNumber - (22.50 * peopleNumber) * 0.05;
            }else if (dayOfWeek.equals("Sunday")){
                totalPrice = 22.50 * peopleNumber;
            }
        }

        System.out.printf("Total price: %.02f", totalPrice);


    }
}
