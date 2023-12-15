import java.util.Scanner;

public class midExamPreparation_GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodQuantityInKG = Double.parseDouble(scanner.nextLine());
        double hayQuantityInKG = Double.parseDouble(scanner.nextLine());
        double coverQuantityInKG = Double.parseDouble(scanner.nextLine());
        double guineaWeightInKG = Double.parseDouble(scanner.nextLine());


        double foodLeft = foodQuantityInKG * 1000;
        double hayLeft = hayQuantityInKG * 1000;
        double coverLeft = coverQuantityInKG * 1000;
        double guineaWeightInGrams = guineaWeightInKG * 1000;

        boolean runOutOfFood = false;

        for (int i = 1; i <= 30; i++) {

            foodLeft = foodLeft - 300;

            if (i % 2 == 0) {
                hayLeft = hayLeft - foodLeft * 0.05;
            }
            if (i % 3 == 0) {
                coverLeft = (coverLeft - guineaWeightInGrams / 3);
            }
            if (foodLeft <= 0 || hayLeft <= 0 || coverLeft <= 0) {
                runOutOfFood = true;
                break;
            }


        }
        if (runOutOfFood) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! " +
                    "Food: %.2f, Hay: %.2f, Cover: %.2f.", foodLeft / 1000, hayLeft / 1000, coverLeft / 1000);
        }


    }
}
