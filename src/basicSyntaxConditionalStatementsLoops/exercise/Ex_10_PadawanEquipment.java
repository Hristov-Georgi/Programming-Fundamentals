package basicSyntaxConditionalStatementsLoops.exercise;

import java.util.Scanner;

public class Ex_10_PadawanEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double pricePerLightsaber = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        int freeBelts = studentsCount / 6;

        double priceSum = ((studentsCount + Math.ceil(studentsCount * 0.10)) * pricePerLightsaber) +
                (studentsCount * pricePerRobe) +
                ((studentsCount - freeBelts) * pricePerBelt);

        if (budget >= priceSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", priceSum);

        } else {
            System.out.printf("George Lucas will need %.2flv more.", priceSum - budget);
        }

    }
}
