package dataTypesAndVariables.exercises;

import java.util.Scanner;

public class Ex_08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        String model = "";
        double biggestKeg = 0;

        for (int i = 1; i <= n; i++) {

            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > biggestKeg) {

                biggestKeg = volume;
                model = kegModel;
            }

        }

        System.out.println(model);
    }
}
