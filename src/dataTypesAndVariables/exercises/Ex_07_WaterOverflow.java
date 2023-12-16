package dataTypesAndVariables.exercises;

import java.util.Scanner;

public class Ex_07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte lines = Byte.parseByte(scanner.nextLine());

        short tankCapacity = 255;

        short litersOfWater = 0;

        for (int i = 1; i <= lines; i++) {

            short waterQuantity = Short.parseShort(scanner.nextLine());
            litersOfWater += waterQuantity;

            if (litersOfWater > tankCapacity){
                System.out.println("Insufficient capacity!");
                litersOfWater -= waterQuantity;

            }

        }

        System.out.println(litersOfWater);

    }
}
